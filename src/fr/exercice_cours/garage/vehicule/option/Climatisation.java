package fr.exercice_cours.garage.vehicule.option;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {
	
	 public String TypeOption()
	    {
	        return "Climatisation";
	    }
	     
	    public double getPrix()
	    {
	        return 112.6;
	    }

}
