package fr.exercice_cours.garage;

import fr.exercice_cours.garage.vehicule.A300B;
import fr.exercice_cours.garage.vehicule.D4;
import fr.exercice_cours.garage.vehicule.Lagouna;
import fr.exercice_cours.garage.vehicule.Vehicule;
import fr.exercice_cours.garage.vehicule.moteur.MoteurDiesel;
import fr.exercice_cours.garage.vehicule.moteur.MoteurElectrique;
import fr.exercice_cours.garage.vehicule.moteur.MoteurEssence;
import fr.exercice_cours.garage.vehicule.moteur.MoteurHybride;
import fr.exercice_cours.garage.vehicule.option.BarreDeToit;
import fr.exercice_cours.garage.vehicule.option.Climatisation;
import fr.exercice_cours.garage.vehicule.option.Gps;
import fr.exercice_cours.garage.vehicule.option.SiegeChauffant;
import fr.exercice_cours.garage.vehicule.option.VitreElectrique;


/**
 * L'application est lancée ici
 * @author Yoann
 *
 */
public class Main {
	/**
	 * Methode de lancement de l'application
	 * @param args
	 */
	public static void main(String[] args) {
		Garage garage = new Garage();   
		System.out.println(garage);

		Vehicule lag1 = new Lagouna();
		lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
		lag1.addOption(new Gps());
		lag1.addOption(new SiegeChauffant());
		lag1.addOption(new VitreElectrique());
		garage.addVoiture(lag1);

		Vehicule A300B_2 = new A300B();
		A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
		A300B_2.addOption(new Climatisation());
		A300B_2.addOption(new BarreDeToit());
		A300B_2.addOption(new SiegeChauffant());
		garage.addVoiture(A300B_2);

		Vehicule d4_1 = new D4();
		d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
		d4_1.addOption(new BarreDeToit());
		d4_1.addOption(new Climatisation());
		d4_1.addOption(new Gps());
		garage.addVoiture(d4_1);   	 

		Vehicule lag2 = new Lagouna();
		lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
		garage.addVoiture(lag2);

		Vehicule A300B_1 = new A300B();
		A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
		A300B_1.addOption(new VitreElectrique());
		A300B_1.addOption(new BarreDeToit());
		garage.addVoiture(A300B_1);

		Vehicule d4_2 = new D4();
		d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
		d4_2.addOption(new SiegeChauffant());
		d4_2.addOption(new BarreDeToit());
		d4_2.addOption(new Climatisation());
		d4_2.addOption(new Gps());
		d4_2.addOption(new VitreElectrique());
		garage.addVoiture(d4_2);   			 
	}
}