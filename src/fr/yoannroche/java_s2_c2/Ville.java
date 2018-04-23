package fr.yoannroche.java_s2_c2;



public class Ville {

	public static int nbreInstances = 0;

	protected String nomVille;
	protected int nbreHabitants;
	protected String nomPays;
	protected char categorie;
	protected static int nbreInstancesBis = 0;
	protected String monument;

	public Ville(){          
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		monument = "Inconnu";
	} 
	public Ville(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		  return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants+" => elle est donc de catégorie : "+this.categorie;
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
	public static int getNombreInstancesBis()
	{
		return nbreInstancesBis;
	}  
	public void setNom(String pNom)
	{
		nomVille = pNom;
	}
	
	public String decrisToi(){
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
	}
}

