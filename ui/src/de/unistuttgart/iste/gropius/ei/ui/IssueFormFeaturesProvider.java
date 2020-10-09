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

import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.FeaturesProvider;

import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;

/**
 * The features provider for forms in this ui plugin.
 * 
 * @author Tim Neuman
 */
public class IssueFormFeaturesProvider extends FeaturesProvider {
    private EClass issueClass = GropiusDataFactory.eINSTANCE.getGropiusDataPackage().getCrossComponentIssue();
    

    @Override
    protected void buildStringMap(EClassToEStructuralFeatureAsStringsMap stringMap) {
        // The default implementation returns all structural features,
        // except derived, unchangeable, container and containment features
        // but we want all strcutural features
        
        // We need to use string map, beacuse otherwise we would overrule the
        // IssueTableFeaturesProvider,
        // because it can only use stringMap
        stringMap.put(this.issueClass.getInstanceClassName(),
                this.issueClass.getEAllStructuralFeatures().stream().map(f -> f.getName())
                        .collect(Collectors.toList()));
    }
}
