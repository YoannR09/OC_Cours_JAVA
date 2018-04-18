package fr.yoannroche.java_s2_c1;

public class MainClass {

	public static void main(String[] args) {
		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 123456, "France");       
		Ville v2 = new Ville("Rio", 321654, "Br�sil");

		System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
		System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
		        
		/*
		  Nous allons interchanger les Villes v1 et v2
		  tout �a par l'interm�diaire d'un autre objet Ville.        
		*/       
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		       
		System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

		/*       
		  Nous allons maintenant interchanger leurs noms
		  cette fois par le biais de leurs mutateurs.
		*/   
		v1.setNom("Hong Kong");
		v2.setNom("Djibouti");
		      
		System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
		System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

	}

}
