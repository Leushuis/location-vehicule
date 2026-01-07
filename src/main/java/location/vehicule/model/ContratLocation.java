package location.vehicule.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "contrats_location")
public class ContratLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private LocalDate dateDebut;

    @Column(nullable = false)
    private LocalDate dateFin;

    @Column(nullable = false)
    private float prixTotal;

    @Column()
    private boolean estSigne;

    @Column()
    private String assuranceChoisie;


    public ContratLocation() {
    }

    public ContratLocation(LocalDate dateDebut, LocalDate dateFin, float prixTotal, boolean estSigne, String assuranceChoisie) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prixTotal = prixTotal;
        this.estSigne = estSigne;
        this.assuranceChoisie = assuranceChoisie;
    }

    public Long getId() {
        return id;
    }
    public LocalDate getDateDebut() {
        return dateDebut;
    }
    public LocalDate getDateFin() {
        return dateFin;
    }
    public float getPrixTotal() {
        return prixTotal;
    }
    public boolean getEstSigne() {
        return estSigne;
    }
    public String getAssuranceChoisie() {
        return assuranceChoisie;
    }

    /*
    public void genererPDF() {
    }

    public float calculerPrixFinal() {
        return this.prixTotal;
    }
    */
}