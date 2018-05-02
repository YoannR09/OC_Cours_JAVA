package fr.exercice_cours.garage.vehicule.moteur;

public class MoteurHybride extends Moteur {
	public MoteurHybride (String cylindre, double prix)
    {
        super(cylindre, prix);
    }
     
    public TypeMoteur getType()
    {
        return TypeMoteur.HYBRIDE;
    }
}

