package fr.yoannroche.java_s2_c11_lesflux;

//Package à importer
import java.io.Serializable;

public class Game implements Serializable{
	private String nom, style;
	private double prix;
	private Notice notice;

	public Game(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
		this.notice = new Notice();
	}

	public String toString() {
		return "Nom du jeu : " + this.nom + "\nStyle de jeu : " + this.style + "\nPrix du jeu : " + this.prix + "\n";
	}
}
