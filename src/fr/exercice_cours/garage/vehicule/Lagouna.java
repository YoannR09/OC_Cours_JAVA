package fr.exercice_cours.garage.vehicule;

public class Lagouna extends Vehicule {
	
	public Lagouna(){
        super();
          
}

public Marque getMarque()
{
     return Marque.TROEN;
}

public float getPrix()
{
    return (float) 45147.7;
}

public String getNom()
{
     return "Lagouna";
}

}
