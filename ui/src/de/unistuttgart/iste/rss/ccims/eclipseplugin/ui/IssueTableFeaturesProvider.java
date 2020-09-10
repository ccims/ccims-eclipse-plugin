/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.ui.provider.EClassToEStructuralFeatureAsStringsMap;
import org.eclipse.emf.parsley.ui.provider.TableFeaturesProvider;
import org.eclipse.jface.preference.IPreferenceStore;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelFactory;

/**
 * The features provider for tables in this ui plugin.
 * 
 * @author Tim Neumann
 */
public class IssueTableFeaturesProvider extends TableFeaturesProvider {
    private EClass issueClass = CcimsDatamodelFactory.eINSTANCE.getCcimsDatamodelPackage()
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
