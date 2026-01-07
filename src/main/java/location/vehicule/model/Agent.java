package location.vehicule.model;





import java.util.ArrayList;

import java.util.List;

public abstract class Agent extends Utilisateur {


    private float factureMensuelle;

    private List<OptionPayante> option = new ArrayList<>(); // si jamais un service payant s'ajoute

    private List<Vehicule> flotte = new ArrayList<>();


    public Agent(String mail, String tel, String rue, String codePostal, String ville, String motDePasse, float factureMensuelle) {

        super(mail, tel, rue, codePostal, ville, motDePasse);

        this.factureMensuelle = factureMensuelle;


    }


    public void ajouterVehicule(Vehicule v) {

        this.flotte.add(v);

    }


    public void souscrireOption(OptionPayante op) {

        this.option.add(op);

    }

    public List<OptionPayante> getOption() {

        return this.option;

    }

    public double calculerFactureOptions() {

        double total = 0.0;

        for (OptionPayante op : this.option)

            total += op.getPrixMensuel();

        return total;

    }
}