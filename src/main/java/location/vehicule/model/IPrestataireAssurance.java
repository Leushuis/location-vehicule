package location.vehicule.model;

import javax.swing.text.Document;

import java.awt.print.Paper;
import java.util.Date;

public interface IPrestataireAssurance {

    /**
     *
     * @param v le vehicule concerné
     * @param d la durée de location
     * @param l le loueur
     * @return le coût calculé sous forme de float
     */
    Float calculerCout(Vehicule v, Object d, Object l);

    /**
     *
     * @return le nom de l'assurance
     */
    String getNom();

    /**
     * Génère le document des conditions générales de l'assurance.
     * @return n objet de type Document
     */
    Object genererConditions();
}
