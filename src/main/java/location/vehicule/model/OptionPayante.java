package location.vehicule.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class OptionPayante {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private double prixMensuel;

    // Constructors
    public OptionPayante() {}
    public OptionPayante(long id, String nom, double prixMensuel) {
        this.id = id;
        this.nom = nom;
        this.prixMensuel = prixMensuel;
    }

    // Getters
    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public double getPrixMensuel() {
        return prixMensuel;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrixMensuel(double prixMensuel) {
        this.prixMensuel = prixMensuel;
    }

}

