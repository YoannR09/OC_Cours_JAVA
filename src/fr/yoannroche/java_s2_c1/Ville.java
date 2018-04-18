package fr.yoannroche.java_s2_c1;


public class Ville {

	//Les variables et les constructeurs n'ont pas changé…
   private String nomVille;
   private int nbreHabitants;
   private String nomPays;
   private char categorie;
    
          public Ville(){
	    System.out.println("Création d'une ville !");          
	    nomVille = "Inconnu";
	    nomPays = "Inconnu";
	    nbreHabitants = 0;
	    this.setCategorie();
	  }
    	 
    	  public Ville(String pNom, int pNbre, String pPays)
    	  {
    	    System.out.println("Création d'une ville avec des paramètres !");
    	    nomVille = pNom;
    	    nomPays = pPays;
    	    nbreHabitants = pNbre;
    	    this.setCategorie();
    	   
    	  }  
    	    
    	  //Retourne le nom de la ville
    	  public String getNom()  {  
    	    return nomVille;
    	  }

    	  public char getCategorie()
    	  {
    	    return categorie;
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
    	  private void setCategorie() {
    		  
    		    int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
    		    char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    		    int i = 0;
    		    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
    		      i++;

    		    this.categorie = categories[i];
    		  }
    	  public String decrisToi(){
    		    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
    		  }

    		  //Retourne une chaîne de caractères selon le résultat de la comparaison
    		  public String comparer(Ville v1){
    		    String str = new String();

    		    if (v1.getNombreHabitants() > this.nbreHabitants)
    		      str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
    		     
    		    else
    		      str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();
    		     
    		    return str;
    		  }
}

