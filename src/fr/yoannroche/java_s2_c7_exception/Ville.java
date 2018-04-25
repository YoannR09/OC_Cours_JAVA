package fr.yoannroche.java_s2_c7_exception;

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

	public Ville(String pNom, int pNbre, String pPays) throws  NombreHabitantException, NomVilleException
	{  
		if(pNbre < 0)
			throw new NombreHabitantException(pNbre);

		if(pNom.length() < 3)
			throw new NomVilleException("le nom de la ville est inférieur à 3 caractères ! nom = " + pNom);
		else
		{
			nbreInstance++;  
			nbreInstanceBis++;

			nomVille = pNom;
			nomPays = pPays;
			nbreHabitant = pNbre;
			this.setCategorie();
		}          
	}




	public String toString(){
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants+" => elle est donc de catégorie : "+this.categorie;
	}

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

	//Retourne la catégorie de la ville
	public char getCategorie()
	{
		return categorie;
	} 

	//Définit le nom de la ville
	public void setNom(String pNom)
	{
		nomVille = pNom;
	}

	//Définit le nom du pays
	public void setNomPays(String pPays)
	{
		nomPays = pPays;
	}

	//Définit le nombre d'habitants
	public void setNombreHabitants(int nbre)
	{
		nbreHabitants = nbre;
		this.setCategorie();
	}  

	//Définit la catégorie de la ville
	private void setCategorie() {

		int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];
	}

	//Retourne la description de la ville
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
