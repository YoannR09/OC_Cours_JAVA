package fr.exercice_cours.garage.vehicule;

public class A300B extends Vehicule{
	
	public A300B(){
        super();
          
}

public Marque getMarque()
{
     return Marque.TROEN;
}

public float getPrix()
{
    return (float) 35147.0;
}

public String getNom()
{
     return "A300B";
}

}
