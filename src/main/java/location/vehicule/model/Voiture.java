package location.vehicule.model;

import jakarta.persistence.*;

@Entity
@Table(name = "voiture")
public class Voiture extends Vehicule{

    // Propriétés
    @Column(nullable = false)
    private int nbPortes;

    // Constructeur
    public Voiture() {
        super();
    }

    public Voiture(String marque, String modele, String etat, String calendrier, int nbrPassager, String typeCarburant, int annee, int nbPortes) {
        super(marque, modele, etat, calendrier, nbrPassager, typeCarburant, annee);
        this.nbPortes = nbPortes;
    }

    // Getters & Setters
    public int getNbPortes() {return this.nbPortes;}
}
