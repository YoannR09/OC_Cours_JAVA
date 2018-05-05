package fr.exercice_cours.garage.vehicule.option;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {

	 public String TypeOption()
	    {
	        return "Barre de Toit";
	    }
	     
	    public double getPrix()
	    {
	        return 124.3;
	    }
}
