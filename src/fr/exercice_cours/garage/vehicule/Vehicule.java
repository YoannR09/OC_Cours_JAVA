package fr.exercice_cours.garage.vehicule;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import fr.exercice_cours.garage.vehicule.moteur.Moteur;
import fr.exercice_cours.garage.vehicule.option.Option;

public abstract class Vehicule implements Serializable {

	 /*
	  * Variable d'instances
	  */
	protected Moteur moteur;
	protected float prix ;
	protected String nom ;
	protected Marque marque ;
	protected List<Option>option = new ArrayList <>();
	
	public Vehicule() {}
	
	public Vehicule (float prix , String nom , Marque marque , List<Option> option ) {
		this.prix = prix;
		this.nom = nom ;
		this.marque = marque;
		this.option = option ;
	}
	public void addOption (Option opt) {
		option.add(opt);
	}
	public float getPrix() {
		return prix;
	}
	public Marque getMarque() {
		return marque;
	}
	public List<Option> getOption(){
		return option;
	}
	public String getNom() {
		return nom;
	}
	public void setMoteur (Moteur m) {
		moteur = m;
	}
	public String toString() {
		String str = " + Voiture " + getMarque()+" : " + getNom()+""+moteur.toString() +"("+getPrix()+"€) " + " [ ";
		String listObject = "";
		int i = 1 ;
		float Total = 0 ;
		for (Option o: getOption())
		{
			i++;
			if(i%getOption().size()-1==0)
			{
				listObject += " " +o.TypeOption()+" ("+o.getPrix()+"€ )";
				Total += o.getPrix();
			}
            else
            {
                listObject +=" "+o.TypeOption()+" ("+o.getPrix()+"€) ";
                Total +=o.getPrix();
            }
        }
        return str+listObject+"] d'une valeur totale de "+Total+"€ \n";
			}
		
	}


	


