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

	protected Moteur moteur;
	protected Double prix ;
	protected String nom ;
	protected Marque marque = Marque.INCONNU;
}

	


