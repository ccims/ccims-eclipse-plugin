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
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;
import org.eclipse.jface.preference.IPreferenceStore;

import de.unistuttgart.iste.gropius.ei.data.GropiusDataFactory;

/**
 * The features provider for tables in this ui plugin.
 * 
 * @author Tim Neumann
 */
public class IssueTableFeaturesProvider extends TableFeaturesProvider {
    private EClass issueClass = GropiusDataFactory.eINSTANCE.getGropiusDataPackage()
            .getCrossComponentIssue();
    private IPreferenceStore store;
    
    /**
     * Create a new issue table features provider
     */
    public IssueTableFeaturesProvider() {
        super();
        this.store = Activator.getDefault().getPreferenceStore();
    }
    
    @Override
    protected void buildStringMap(EClassToEStructuralFeatureAsStringsMap stringMapToBuild) {
        String prefString = this.store.getString(UiPreferences.ISSUE_LIST_COLUMNS);
        List<String> enabledColumns = new ArrayList<>(IssueListColumnsHelper.getEnabledCloumns(prefString));
        enabledColumns.sort(IssueListColumnsHelper.columnOrderComparator());
        stringMapToBuild.put(this.issueClass.getInstanceClassName(), enabledColumns);
    }
    
}
