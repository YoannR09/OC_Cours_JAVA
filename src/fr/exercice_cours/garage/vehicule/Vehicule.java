package fr.exercice_cours.garage.vehicule;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.exercice_cours.garage.vehicule.moteur.Moteur;
import fr.exercice_cours.garage.vehicule.option.Option;

public abstract class Vehicule implements Serializable {

	protected Moteur moteur;
	protected Double prix ;
	protected String nom ;
	protected Marque marque ;
	protected List<Option>option = new ArrayList <>();
	
	public Vehicule() {}
	
	public Vehicule (Double prix , String nom , Marque marque , List<Option> option ) {
		this.prix = prix;
		this.nom = nom ;
		this.marque = marque;
		this.option = option ;
	}
	public void addOption (Option opt) {
		option.add(opt);
	}
	public Double getPrix() {
		return prix;
	}
	public Marque getMarque() {
		return marque;
	}
	public List<Option> getOption(){
		return option;
	}
	public String getNom() {
		return nom;
	}
	public void setMoteur (Moteur m) {
		moteur = m;
	}
}

	


