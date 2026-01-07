package location.vehicule.model;

import jakarta.persistence.*;

@Entity
@Table(name = "option_entretien_auto")
public class OptionEntretienAuto extends OptionPayante{
    // Attributes
    @Column(nullable = false)
    private String prestataire;

    // Constructors
    public OptionEntretienAuto() {}
    public OptionEntretienAuto(long id, String nom, double prixMensuel, String prestataire){
        super(id, nom, prixMensuel);
        this.prestataire = prestataire;
    }

    // Getters
    public String getPrestataire() {
        return this.prestataire;
    }

    // Setters
    public void setPrestataire(String prestataire) {
        this.prestataire = prestataire;
    }
 // Methods

}
