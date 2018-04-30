package fr.exercice_cours.garage.vehicule;

public enum Marque {
	RENO("De la marque RENO"),
	PIGEOT("De la marque PIGEOT"),
	TROEN("De la marque TROEN"),
	INCONNU("Pas de marque");


	private String marque = "";

	Marque(String marque){
		this.marque = marque;
	}
	public String toString () {
		return marque;
	}
}
