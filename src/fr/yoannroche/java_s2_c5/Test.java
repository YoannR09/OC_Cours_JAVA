package fr.yoannroche.java_s2_c5;

public class Test { 
	  public static void main(String[] args) {
		  Chien c = new Chien("Gris bleuté", 20);
		    c.boire();
		    c.manger();
		    c.deplacement();
		    c.crier();
		    System.out.println(c.toString());
					
		    System.out.println("--------------------------------------------");
		    //Les méthodes de l'interface
		    c.faireCalin();
		    c.faireLeBeau();
		    c.faireLechouille();
				
		    System.out.println("--------------------------------------------");
		    //Utilisons le polymorphisme de notre interface
		    Rintintin r = new Chien();
		    r.faireLeBeau();
		    r.faireCalin();
		    r.faireLechouille();
	  } 
	}