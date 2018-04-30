package fr.exercice_cours.garage;

import java.util.ArrayList;


public class Garage {
	public Garage() {

		ArrayList al = new ArrayList();
		al.add("Lagouna");
		al.add("D4");
		al.add("A300B");

		for (int i = 0 ; i < al.size(); i++)
		{
			System.out.println("Voiture" + al.get(i));
		}
		public String to String() {
			System.out.println(this.nom + this.prix + this.option + this.marque);
		}
	}



}
