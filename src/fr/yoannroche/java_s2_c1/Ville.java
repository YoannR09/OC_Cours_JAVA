package fr.yoannroche.java_s2_c1;


public class Ville {

	public static int nbreInstances = 0;

	private String nomVille;
	private int nbreHabitants;
	private String nomPays;
	private char categorie;
	private static int nbreInstancesBis = 0;

	public Ville(){
		System.out.println("Création d'une ville !");          
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;   
	}

	public Ville(String pNom, int pNbre, String pPays)
	{
		System.out.println("Création d'une ville avec des paramètres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		this.setCategorie();
		nbreInstances++;
		nbreInstancesBis++;   
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
	
	/**
	 * Le programme est lancer ici.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ville.main(...)");
		Ville v = new Ville();                
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

		Ville v1 = new Ville("Marseille", 1236, "France");        
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

		Ville v2 = new Ville("Rio", 321654, "Brésil");        
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
		System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
	}
}

