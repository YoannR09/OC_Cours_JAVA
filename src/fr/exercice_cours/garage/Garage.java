package fr.exercice_cours.garage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import fr.exercice_cours.garage.vehicule.Vehicule;


public class Garage {
	 
    protected List<Vehicule> voitures = new LinkedList<Vehicule>();
    private static String cheminFichier = "src/fr/exercice_cours/garage/List.txt";
 
    //charge garage.txt (recup from file) à son instantiation************ 
    public Garage(){
        voitures = new LinkedList<Vehicule>();
       
        try (FileInputStream fis = new FileInputStream(cheminFichier) ; BufferedInputStream bis = new BufferedInputStream(fis) ; ObjectInputStream ois = new ObjectInputStream(bis)) {
            this.voitures = (List<Vehicule>)ois.readObject();        
        } catch (ClassNotFoundException e) {
        } catch (FileNotFoundException e) {
            System.out.println("Aucune voiture sauvegardée!");
        } catch (IOException e) {
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
            str += "> d'une valeur totale de " + voitures.get(i).getPrix() + " €"   ;
        }
        return str;
    }
   	
	    }
	    
	      
	      
	
	      
    

	

		



