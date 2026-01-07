package location.vehicule.model;

import jakarta.persistence.*;

@Entity
@Table(name = "camion")
public class Camion extends Vehicule {

    // Attributes
    @Column(nullable = false)
    private float volumeChargement;

    @Column(nullable = false)
    private float hauteur;

    @Column(nullable = false)
    private boolean necessitePermisC;

    // Constructors
    public Camion() {
        super();
    }
    public Camion(String marque, String modele, String etat, String calendrier, int nbrPassager, String typeCarburant, int annee, float volumeChargement, float hauteur, boolean necessitePermisC) {
        super(marque, modele, etat, calendrier, nbrPassager, typeCarburant, annee);
        this.volumeChargement= volumeChargement;
        this.hauteur = hauteur;
        this.necessitePermisC = necessitePermisC;
    }

    // Getters & Setters
    public float getVolumeChargement() {
        return volumeChargement;
    }
    public void setVolumeChargement(float volumeChargement) {this.volumeChargement = volumeChargement;}

    public float getHauteur() {return hauteur;}
    public void setHauteur(float hauteur) {this.hauteur = hauteur;}

    public boolean getNecessitePermisC() {return necessitePermisC;}
    public void setNecessitePermisC(boolean NecessitePermisC) {this.necessitePermisC = NecessitePermisC;}

}
