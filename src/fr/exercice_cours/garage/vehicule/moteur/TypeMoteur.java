package fr.exercice_cours.garage.vehicule.moteur;

public enum TypeMoteur {
	DIESEL("Moteur Diesel"),
	ESSENCE("Moteur Essence"),
	HYBRIDE("Moteur Hybride"),
	ELECTRIQUE("Moteur Electrique");

	private String typeMoteur = "";

	TypeMoteur(String typeMoteur ){
		this.typeMoteur = typeMoteur ;
	}
	public String toString() {
		return typeMoteur;
	}
}