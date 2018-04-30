package fr.exercice_cours.garage.vehicule.option;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashMap;

public interface Option {
	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		ht.put("Gps", 0.0d);
		ht.put("Climatisation", 0.0d);
		ht.put("BarreDeToit", 0.0d);
		ht.put("SiegeChauffant", 0.0d);
		ht.put("VitreEletrique", 0.0d);

		Enumeration e = ht.elements();
		
		String option = "";
		Double prix = 0.0d;

		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		}

	}



