package location.vehicule.model;

import jakarta.persistence.*;

@Entity
@Table(name = "loueur")
public class Loueur extends Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loueur")
    private Long idLoueur;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    // 🔹 Constructeur vide obligatoire pour JPA
    public Loueur() {
        super();
    }

    // 🔹 Constructeur pratique
    public Loueur(String mail, String tel, String rue,
                  String codePostal, String ville, String motDePasse,
                  String nom, String prenom) {
        super(mail, tel, rue, codePostal, ville, motDePasse);
        this.nom = nom;
        this.prenom = prenom;
    }

    // 🔹 Getters & Setters
    public Long getIdLoueur() {
        return idLoueur;
    }

    public void setIdLoueur(Long idLoueur) {
        this.idLoueur = idLoueur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
