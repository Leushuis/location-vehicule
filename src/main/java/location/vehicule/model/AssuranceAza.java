package location.vehicule.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AssuranceAza")
public class AssuranceAza implements IPrestataireAssurance{

    private Long id;
    private final String nom = "Assurance AZA";
    public AssuranceAza(){}

    @Override
    public Float calculerCout(   Vehicule v, Object d, Object l) {
        return 0f;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNom() {
        return "";
    }

    @Override
    public Object genererConditions() {
        return null;
    }

    public void setNom(String nom) {

    }
}
