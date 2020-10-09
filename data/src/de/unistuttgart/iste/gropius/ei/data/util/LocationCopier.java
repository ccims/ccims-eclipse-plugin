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

import java.util.Arrays;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;
import de.unistuttgart.iste.gropius.ei.data.Location;

/**
 * @author Tim Neumann
 *
 */
public class LocationCopier {
    
    private Location copy;
    private EClass clazz = GropiusDataFactory.eINSTANCE.getGropiusDataPackage().getLocation();

    /**
     * Create a new copier and copies the original;
     * 
     * @param original The original to copy
     */
    public LocationCopier(Location original) {
        this.copy = GropiusDataFactory.eINSTANCE.createLocation();
        for (EStructuralFeature f : this.clazz.getEAllStructuralFeatures()) {
            this.copy.eSet(f, original.eGet(f));
        }
    }
    
    /**
     * @return the generated copy
     */
    public Location getCopy() {
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
    }
}
