package fr.exercice_cours.garage.vehicule.moteur;

public class MoteurElectrique extends Moteur {
	  public MoteurElectrique (String cylindre, double prix)
	    {
	        super(cylindre, prix);
	    }
	     
	    public TypeMoteur getType()
	    {
	        return TypeMoteur.ELECTRIQUE;
	    }

}
