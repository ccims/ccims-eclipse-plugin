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
package de.unistuttgart.iste.gropius.ei.data.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.unistuttgart.iste.gropius.ei.data.CrossComponentIssue;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;
import de.unistuttgart.iste.gropius.ei.data.GropiusDataPackage;
import de.unistuttgart.iste.gropius.ei.data.Location;

/**
 * @author Tim Neumann
 *
 */
public class CrossComponentIssueCopier {
    
    private CrossComponentIssue copy;
    private EClass clazz = GropiusDataFactory.eINSTANCE.getGropiusDataPackage().getCrossComponentIssue();
    
    private List<LocationCopier> locationCopiers = new ArrayList<>();
    
    /**
     * Create a new copier and copie the original;
     * 
     * @param original The original to copy
     */
    public CrossComponentIssueCopier(CrossComponentIssue original) {
        this.copy = GropiusDataFactory.eINSTANCE.createCrossComponentIssue();
        for (EStructuralFeature f : this.clazz.getEAllStructuralFeatures()) {
            if (f.getFeatureID() == GropiusDataPackage.CROSS_COMPONENT_ISSUE__LOCATIONS) {
                for(Location location : original.getLocations()) {
                    this.copy.getLocations().add(copyLocation(location));
                }
            } else {
                this.copy.eSet(f, original.eGet(f));
            }
        }
    }
    
    private Location copyLocation(Location location) {
        LocationCopier copier = new LocationCopier(location);
        this.locationCopiers.add(copier);
        return copier.getCopy();
    }
    
    /**
     * @return the generated copy
     */
    public CrossComponentIssue getCopy() {
        return this.copy;
    }
    
    /**
     * Reset the copy to all default values.
     * <p>
     * Do this to make sure no other EObjects have any references to the copy.
     */
    public void resetCopy() {
        for (EStructuralFeature f : this.clazz.getEAllStructuralFeatures()) {
            this.copy.eSet(f, f.isMany() ? Arrays.asList(new Object[0]) : f.getDefaultValue());
        }
        
        for (LocationCopier copier : this.locationCopiers) {
            copier.resetCopy();
        }
    }
    
}
