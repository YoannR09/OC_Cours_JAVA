package fr.exercice_cours.garage.vehicule;

import fr.exercice_cours.garage.vehicule.option.*;

import java.util.LinkedList;
import java.lang.Enum;

import fr.exercice_cours.garage.vehicule.moteur.Moteur;
import fr.exercice_cours.garage.vehicule.moteur.MoteurDiesel;
import fr.exercice_cours.garage.vehicule.moteur.MoteurElectrique;
import fr.exercice_cours.garage.vehicule.moteur.MoteurEssence;
import fr.exercice_cours.garage.vehicule.moteur.MoteurHybride;
import fr.exercice_cours.garage.vehicule.option.Option;
import fr.exercice_cours.garage.vehicule.option.SiegeChauffant;
import fr.exercice_cours.garage.vehicule.option.VitreElectrique;

public class Vehicule implements Option {

	protected Moteur moteur = new Moteur();
	public Double prix = 0.0d;
	public String nom = null;
	public Marque marque = Marque.INCONNU;

	public void addOption(Gps gps,Climatisation climatisation , BarreDeToit barreDeToit , SiegeChauffant siegeChauffant, VitreElectrique vitreElectrique ){

		{
		}

	}

	public void setMoteur(MoteurEssence moteurEssence ,MoteurDiesel moteurDiesel ,MoteurHybride moteurHybride , MoteurElectrique moteurElectrique) {

	}
	
	System.out.println("La voiture est équipée d'un "+moteur+"\nSon prix est de :"+prix+"\nson nom :"+nom+"\nNom de la marque :"+marque );
}


