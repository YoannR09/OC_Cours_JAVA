package fr.exercice_cours.garage.vehicule.moteur;

public class MoteurDiesel extends Moteur {
	public MoteurDiesel (String cylindre, double prix)
    {
        super(cylindre, prix);
    }
     
    public TypeMoteur getType()
    {
        return TypeMoteur.DIESEL;
    }

}
