package fr.exercice_cours.garage.vehicule.moteur;

public class Moteur {
	TypeMoteur type = TypeMoteur.INCONNU;
	public String cylindre;
	private int prix ;
	
	public Moteur () {}
	
	public Moteur (TypeMoteur type , String cylindre , int prix) {
		this.type = type;
		this.cylindre = cylindre ;
		this.prix = prix;
		
	}
	public String toString() {
		return cylindre;
		
	}

}
