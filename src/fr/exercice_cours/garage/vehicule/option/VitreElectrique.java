package fr.exercice_cours.garage.vehicule.option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {
	
	 public String TypeOption()
	    {
	        return "VitreElectrique";
	    }
	     
	    public double getPrix()
	    {
	        return 68.9;
	    }

}
