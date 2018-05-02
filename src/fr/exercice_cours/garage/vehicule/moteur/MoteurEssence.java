package fr.exercice_cours.garage.vehicule.moteur;

public class MoteurEssence extends Moteur {
	public MoteurEssence (String cylindre, double prix)
    {
        super(cylindre, prix);
    }
     
    public TypeMoteur getType()
    {
        return TypeMoteur.ESSENCE;
    }
}

