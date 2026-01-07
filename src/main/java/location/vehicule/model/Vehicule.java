package location.vehicule.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String marque;

    @Column(nullable = false)
    private String modele;

    @Column(nullable = false)
    private String etat;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    private String calendrier;

    @Column(nullable = false)
    private int nbrPassager;

    @Column(nullable = false)
    private String typeCarburant;

    @Column(nullable = false)
    private int annee;

    // 🔹 Constructeur vide obligatoire pour JPA

    // 🔹 Constructeur pratique
    public Vehicule(String marque, String modele, String etat, String calendrier,int nbrPassager,String typeCarburant, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.etat = etat;
        this.calendrier = calendrier;
        this.nbrPassager = nbrPassager;
        this.typeCarburant = typeCarburant;
        this.annee = annee;
    }

    public Vehicule() {

    }

    // 🔹 Getters & Setters
    public Long getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getEtat() {return etat;}
    public void setEtat(String etat) {this.etat = etat;}

    public String getCalendrier() {return calendrier;}
    public void setCalendrier(String calendrier) {this.calendrier = calendrier;}

    public int getNbrPassager() {return nbrPassager;}
    public void setNbrPassager(int nbrPassager) {this.nbrPassager = nbrPassager;}

    public String getTypeCarburant() {return typeCarburant;}
    public void setTypeCarburant(String typeCarburant) {this.typeCarburant = typeCarburant;}

    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    // Méthodes
}
