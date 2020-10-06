/**
 * 
 */
package de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CcimsDatamodelFactory;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.Location;

/**
 * @author Tim Neumann
 *
 */
public class LocationCopier {
    
    private Location copy;
    private EClass clazz = CcimsDatamodelFactory.eINSTANCE.getCcimsDatamodelPackage().getLocation();

    /**
     * Create a new copier and copies the original;
     * 
     * @param original The original to copy
     */
    public LocationCopier(Location original) {
        copy = CcimsDatamodelFactory.eINSTANCE.createLocation();
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
            this.copy.eSet(f, f.getDefaultValue());
        }
    }
}
