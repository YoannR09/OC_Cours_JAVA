package fr.exercice_cours.garage.vehicule.option;

import java.io.Serializable;

public class Gps implements Option, Serializable {

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return 230.2;
	}

	@Override
	public String TypeOption() {
		// TODO Auto-generated method stub
		return "GPS";
	}

	
}