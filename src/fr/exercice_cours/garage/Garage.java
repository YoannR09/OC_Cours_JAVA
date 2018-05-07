package fr.exercice_cours.garage;

import java.util.LinkedList;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import fr.exercice_cours.garage.vehicule.Vehicule;
import fr.exercice_cours.garage.vehicule.option.Option;


public class Garage implements Serializable {

	private static final String Total = null;
	protected List<Vehicule> voitures = new LinkedList<Vehicule>();
	private int Option;
	private static String cheminFichier = "src/fr/exercice_cours/garage/List.txt";

	public Garage(){
		voitures = new LinkedList<Vehicule>();

		try (FileInputStream fis = new FileInputStream(cheminFichier) ; BufferedInputStream bis = new BufferedInputStream(fis) ; ObjectInputStream ois = new ObjectInputStream(bis)) {
			this.voitures = (List<Vehicule>)ois.readObject();        
		} catch (ClassNotFoundException e) {
		} catch (FileNotFoundException e) {
			
		} catch (IOException e)
		
		
		{
			System.out.println("Aucune voiture sauvegardée!");
			
		}
		
	}


	/*
	 * Ajout de la voiture
	 */
	public void addVoiture(Vehicule voit) {

		this.voitures.add(voit);


		try (FileOutputStream fos = new FileOutputStream(cheminFichier) ; BufferedOutputStream bos = new BufferedOutputStream(fos) ; ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			oos.writeObject(this.voitures);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String toString(){
		
		String str = "";      
		str += "***************************\n";
		str += "*  Garage OpenClassrooms  *\n";
		str += "***************************";
		


		for (int i = 0; i < voitures.size(); i++) {
			str += "\n ";
			str += voitures.get(i).toString(); 
			str += "> d'une valeur totale de " + voitures.get(i).getPrix()  + " €"   ;
		}
		return str;
	}

}













