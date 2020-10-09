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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;

import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;

/**
 * @author Tim Neumann
 *
 */
public class IssueListColumnsHelper {
    private IssueListColumnsHelper() {
        //hide
    }
    
    private static EClass issueClass;
    
    private static Comparator<String> columnOrderComparator;
    
    static {
        issueClass = GropiusDataFactory.eINSTANCE.getGropiusDataPackage()
                .getCrossComponentIssue();
        Map<String, Integer> columnPriorities = new HashMap<>();
        columnPriorities.put("title", -10);
        columnPriorities.put("textBody", -8);
        columnPriorities.put("isOpen", -6);
        columnPriorities.put("assignees", -4);
        columnPriorities.put("labels", -2);
        columnPriorities.put("linkedIssues", 2);
        columnPriorities.put("locations", 4);
        columnOrderComparator = new Comparator<String>() {
            private int getPriority(String column) {
                Integer prio = columnPriorities.get(column);
                if (prio != null)
                    return prio.intValue();
                return 0;
            }
            
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2))
                    return 0;
                return Integer.compare(getPriority(o1), getPriority(o2));
                
            }
        };
    }
    
    /**
     * Get a list of the names of all structural features of CrossComponentIssues
     * 
     * @return A list of the names of the structural features
     */
    public static List<String> getIssueStructuralFeatureNames() {
        return issueClass.getEStructuralFeatures().stream().map(f -> f.getName())
                .collect(Collectors.toUnmodifiableList());
    }
    
    /**
     * Get the enabled comlumns from athe preference string
     * 
     * @param prefString The preference string to extract the columns from
     * 
     * @return A set with the names of the enabled columns
     */
    public static Set<String> getEnabledCloumns(String prefString) {
        return Set.of(prefString.split(";"));
    }
    
    /**
     * Generate the preference string for the given enabled columns
     * 
     * @param enabledColumns The enabled columns to serialize
     * 
     * @return The preference string containing the enabled columns
     */
    public static String getPrefStringFromEnabledColumns(Set<String> enabledColumns) {
        List<String> entriesList = new ArrayList<>(enabledColumns);
        entriesList.sort(columnOrderComparator);
        return String.join(";", entriesList);
    }
    
    /**
     * @return a comparator to sort column names
     */
    public static Comparator<String> columnOrderComparator() {
        return columnOrderComparator;
    }
}
