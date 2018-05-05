package fr.exercice_cours.garage.vehicule;

import java.io.Serializable;

public enum Marque implements Serializable {
	RENO("De la marque RENO"),
	PIGEOT("De la marque PIGEOT"),
	TROEN("De la marque TROEN");


	private String marque = "";

	Marque(String marque){
		this.marque = marque;
	}
	public String toString () {
		return marque;
	}
}
