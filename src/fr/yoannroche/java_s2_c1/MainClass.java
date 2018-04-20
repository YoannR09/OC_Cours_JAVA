package fr.yoannroche.java_s2_c1;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("MainClass.main(...)");
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
