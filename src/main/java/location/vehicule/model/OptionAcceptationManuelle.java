package location.vehicule.model;

import jakarta.persistence.*;

@Entity
@Table(name = "option_acceptation_manuelle")
public class OptionAcceptationManuelle extends OptionPayante{
    // Attributes

    // Constructors
    public OptionAcceptationManuelle() {}
    public OptionAcceptationManuelle(long id, String nom, double prixMensuel) {
        super(id, nom, prixMensuel);
    }

    // Getters

    // Setters

}
