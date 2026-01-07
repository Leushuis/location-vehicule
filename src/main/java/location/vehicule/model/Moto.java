package location.vehicule.model;


import jakarta.persistence.*;

@Entity
@Table(name = "moto")
public class Moto extends Vehicule{

    // Attributes
    @Column(nullable = false)
    private int cylindree;

    @Column(nullable = false)
    private boolean necessitePermisA2;


    // Constructors

    public Moto() {
        super();
    }

    public Moto(String marque, String modele, String etat, String calendrier, int nbrPassager, String typeCarburant, int annee, int cylindree, boolean necessitePermisA2) {
        super(marque, modele, etat, calendrier, nbrPassager, typeCarburant, annee);
        this.cylindree = cylindree;
        this.necessitePermisA2 = necessitePermisA2;
    }


    // Getters & Setters
    public int getCylindree() {return this.cylindree;}
    public void setCylindree(int cylindree) {this.cylindree = cylindree;}

    public boolean getNecessitePermisA2() {return necessitePermisA2;}
    public void setNecessitePermisA2(boolean necessitePermisA2) {this.necessitePermisA2 = necessitePermisA2;}
}
