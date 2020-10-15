/**
 * Copyright (C) 2020, Tim Neumann <neumantm@fius.informatik.uni-stuttgart.de>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.unistuttgart.iste.gropius.ei.ui;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import de.unistuttgart.iste.gropius.ei.data.Component;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.gropius.ei.data.Developer;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;
import de.unistuttgart.iste.gropius.ei.data.Interface;
import de.unistuttgart.iste.gropius.ei.data.Label;
import de.unistuttgart.iste.gropius.ei.data.Location;

/**
 * @author Tim Neumann
 *
 */
public class MockDataGenerator {
    private static int RANDOM_LABEL_MAX_COUNT = 6;
    private static int RANDOM_DEVELOPER_MAX_COUNT = 5;
    private static int RANDOM_COMPONENNT_MAX_COUNT = 10;
    private static int RANDOM_INTERFACE_MAX_COUNT = 10;
    private static int RANDOM_ISSUE_MAX_COUNT = 40;
    private static int CONSUMED_INTERFACES_PER_COMPONENT_MAX = 5;
    private static int ASSIGNE_PER_ISSUE_MAX = 3;
    private static int LABEL_PER_ISSUE_MAX = 3;
    private static int LINKED_ISSUE_PER_ISSUE_MAX = 3;
    private static int LOCATIONS_PER_ISSUE_MAX = 3;
    private MockDataGenerator() {
        // hide
    }
    
    /**
     * @return A generated CrossComponentIssueManagementSystem with some mock data
     */
    public static CrossComponentIssueManagementSystem generateMockData() {
        Random rng = new Random(1L);
        List<Label> labels = new ArrayList<>();
        labels.add(label("WIP"));
        labels.add(label("enhancement"));
        int count = rng.nextInt(RANDOM_LABEL_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            labels.add(label("Label " + i));
        }
        
        List<Developer> developers = new ArrayList<>();
        developers.add(developer("Tim"));
        count = rng.nextInt(RANDOM_DEVELOPER_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            developers.add(developer("Developer " + i));
        }
        
        List<Component> components = new ArrayList<>();
        count = rng.nextInt(RANDOM_COMPONENNT_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            components.add(component("Component " + i));
        }
        
        List<Interface> interfaces = new ArrayList<>();
        count = rng.nextInt(RANDOM_INTERFACE_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            interfaces.add(interfaz("Interface " + i));
        }
        
        Map<Interface, Component> interfaceLocationMap = new HashMap<>();
        
        for (Interface intf : interfaces) {
            Component comp = components.get(rng.nextInt(components.size()));
            comp.getProvidedInterfaces().add(intf);
            interfaceLocationMap.put(intf, comp);
        }
        
        for (Component comp : components) {
            count = rng.nextInt(CONSUMED_INTERFACES_PER_COMPONENT_MAX);
            for (int i = 0; i < count; i++) {
                Interface intf = interfaces.get(rng.nextInt(interfaces.size()));
                if (!comp.getProvidedInterfaces().contains(intf) && !comp.getConsumedInterfaces().contains(intf)) {
                    comp.getConsumedInterfaces().add(intf);
                }
            }
        }
        
        List<CrossComponentIssue> issues = new ArrayList<>();
        count = rng.nextInt(RANDOM_ISSUE_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            issues.add(issue("Issue " + i, "Issue " + i + " description", rng.nextBoolean()));
        }
        
        for (CrossComponentIssue issue : issues) {
            count = rng.nextInt(ASSIGNE_PER_ISSUE_MAX);
            for (int i = 0; i < count; i++) {
                Developer dev = developers.get(rng.nextInt(developers.size()));
                if (!issue.getAssignees().contains(dev)) {
                    issue.getAssignees().add(dev);
                }
            }
            count = rng.nextInt(LABEL_PER_ISSUE_MAX);
            for (int i = 0; i < count; i++) {
                Label label = labels.get(rng.nextInt(labels.size()));
                if (!issue.getLabels().contains(label)) {
                    issue.getLabels().add(label);
                }
            }
            count = rng.nextInt(LINKED_ISSUE_PER_ISSUE_MAX);
            for (int i = 0; i < count; i++) {
                CrossComponentIssue linkedIssue = issues.get(rng.nextInt(issues.size()));
                if (!issue.getLinkedIssues().contains(linkedIssue)) {
                    issue.getLinkedIssues().add(linkedIssue);
                }
            }
            count = rng.nextInt(LOCATIONS_PER_ISSUE_MAX);
            for (int i = 0; i < count; i++) {
                Location location = GropiusDataFactory.eINSTANCE.createLocation();
                URI uri = null;
                uri = randomValidExistingResourceUriForJavaFile(rng);
                if (uri == null) {
                    uri = UriHelper.resourceURI("/projectX/Y/Z.java");
                }
                location.setResourcePath(uri);
                if (rng.nextBoolean()) {
                    location.setLine(rng.nextInt(100) + 1);
                } else {
                    location.setLine(0);
                }
                if(rng.nextBoolean()) {
                    Interface intf = interfaces.get(rng.nextInt(interfaces.size()));
                    Component comp = interfaceLocationMap.get(intf);
                    location.setInterface(intf);
                    location.setComponent(comp);
                } else {
                    Component comp = components.get(rng.nextInt(components.size()));
                    location.setComponent(comp);
                }
                issue.getLocations().add(location);
            }
        }
        
        CrossComponentIssueManagementSystem ccims = GropiusDataFactory.eINSTANCE
                .createCrossComponentIssueManagementSystem();
        ccims.setLocationUri(uri("local://mock"));
        ccims.getComponents().addAll(components);
        ccims.getDevelopers().addAll(developers);
        ccims.getLabels().addAll(labels);
        ccims.getManagedCroCoIssues().addAll(issues);
        
        return ccims;
    }
    
    private static URI uri(String uri) {
        try {
            return new URI(uri);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Not a valid Uri", e);
        }
    }
    
    /**
     * Returns a valid uri for a existing resource if it can find one.
     * Otherwise returns null
     * @param rng The random number generator for randomization
     * @return The uri or null if non could be found
     */
    private static URI randomValidExistingResourceUriForJavaFile(Random rng) {
        try {
            IFile file = findRandomJavaIFile(rng, ResourcesPlugin.getWorkspace().getRoot());
            if (file == null)
                return null;
            
            return UriHelper.resourceURI(file);
        } catch (CoreException e) {
            Activator.logError("Error while searching for IFile", e);
            return null;
        }
    }
    
    private static IFile findRandomJavaIFile(Random rng, IContainer resource) throws CoreException {
        IResource[] members = resource.members();
        if (members.length == 0)
            return null;
        int startingIndex = rng.nextInt(members.length);
        int index = startingIndex;
        do {
            IResource member = members[index];
            if (member instanceof IFile && "java".equals(member.getFileExtension())) {
                return (IFile) member;
            } else if (member instanceof IContainer) {
                IFile file = findRandomJavaIFile(rng, (IContainer) member);
                if (file != null) {
                    return file;
                }
            }
            index = (index + 1) % members.length;
        } while (index != startingIndex);
        return null;
    }
    
    private static Label label(String name) {
        Label res = GropiusDataFactory.eINSTANCE.createLabel();
        res.setName(name);
        return res;
    }
    
    private static Developer developer(String name) {
        Developer res = GropiusDataFactory.eINSTANCE.createDeveloper();
        res.setName(name);
        return res;
    }
    
    private static Component component(String name) {
        Component res = GropiusDataFactory.eINSTANCE.createComponent();
        res.setName(name);
        return res;
    }
    
    private static Interface interfaz(String name) {
        Interface res = GropiusDataFactory.eINSTANCE.createInterface();
        res.setName(name);
        return res;
    }
    
    private static CrossComponentIssue issue(String title, String description, boolean isOpen) {
        CrossComponentIssue res = GropiusDataFactory.eINSTANCE.createCrossComponentIssue();
        res.setTitle(title);
        res.setTextBody(description);
        res.setIsOpen(isOpen);
        return res;
    }
}
