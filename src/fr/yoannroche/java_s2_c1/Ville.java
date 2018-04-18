package fr.yoannroche.java_s2_c1;


public class Ville {

	//Les variables et les constructeurs n'ont pas changé…
   private String nomVille;
   private int nbreHabitants;
   private String nomPays;
    
    
 
    	   
    	  public Ville(){
    	    System.out.println("Création d'une ville !");          
    	    nomVille = "Inconnu";
    	    nomPays = "Inconnu";
    	    nbreHabitants = 0;
    	  
    	  }
    	 
    	  public Ville(String pNom, int pNbre, String pPays)
    	  {
    	    System.out.println("Création d'une ville avec des paramètres !");
    	    nomVille = pNom;
    	    nomPays = pPays;
    	    nbreHabitants = pNbre;
    	   
    	  }  
    	    
    	  //Retourne le nom de la ville
    	  public String getNom()  {  
    	    return nomVille;
    	  }

    	  //Retourne le nom du pays
    	  public String getNomPays()
    	  {
    	    return nomPays;
    	  }

    	  // Retourne le nombre d'habitants
    	  public int getNombreHabitants()
    	  {
    	    return nbreHabitants;
    	  } 
    	  public void setNom(String pNom)
    	  {
    	    nomVille = pNom;
    	  }
}

