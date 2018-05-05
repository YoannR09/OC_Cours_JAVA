package fr.exercice_cours.garage.vehicule.option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {
	
	 public String TypeOption()
	    {
	        return "Siège Chauffant";
	    }
	     
	    public double getPrix()
	    {
	        return 562.9;
	    }

}
