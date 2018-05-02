package fr.exercice_cours.garage.vehicule.moteur;

import java.io.Serializable;

public class Moteur implements Serializable{
	protected TypeMoteur type ;
	protected String cylindre;
	private Double prix ;
	
	public Moteur () {}
	
	public Moteur (String cylindre , Double prix) {
		this.cylindre = cylindre ;
		this.prix = prix;
		
	}
		
	public Double getPrix() {
		return this.prix;
	}
	public TypeMoteur getType() {
		return type ;
	}
	public String toString()
    {
        String str = "Moteur "+getType()+" "+this.cylindre;
        return str;
    }

}
