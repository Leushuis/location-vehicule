package location.vehicule.model;

public abstract class Utilisateur {

    protected String mail;
    protected String tel;
    protected String rue;
    protected String codePostal;
    protected String ville;
    protected String motDePasse;

    // 🔹 Constructeur vide
    public Utilisateur() {
    }

    // 🔹 Constructeur pratique
    public Utilisateur(String mail, String tel, String rue,
                       String codePostal, String ville, String motDePasse) {
        this.mail = mail;
        this.tel = tel;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.motDePasse = motDePasse;
    }

    // 🔹 Getters & Setters
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
