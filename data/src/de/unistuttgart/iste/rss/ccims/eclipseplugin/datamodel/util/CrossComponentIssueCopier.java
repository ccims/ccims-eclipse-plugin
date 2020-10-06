/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelFactory;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelPackage;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssue;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location;

/**
 * @author Tim Neumann
 *
 */
public class CrossComponentIssueCopier {
    
    private CrossComponentIssue copy;
    private EClass clazz = CcimsDatamodelFactory.eINSTANCE.getCcimsDatamodelPackage().getCrossComponentIssue();
    
    private List<LocationCopier> locationCopiers = new ArrayList<>();
    
    /**
     * Create a new copier and copie the original;
     * 
     * @param original The original to copy
     */
    public CrossComponentIssueCopier(CrossComponentIssue original) {
        this.copy = CcimsDatamodelFactory.eINSTANCE.createCrossComponentIssue();
        for (EStructuralFeature f : this.clazz.getEAllStructuralFeatures()) {
            if(f.getFeatureID() == CcimsDatamodelPackage.CROSS_COMPONENT_ISSUE__LOCATIONS) {
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
