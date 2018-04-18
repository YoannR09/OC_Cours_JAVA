package fr.yoannroche.java_s2_c1;

public class MainClass {

	public static void main(String[] args) {
		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 1236, "France");       
		Ville v2 = new Ville("Rio", 654321, "Brésil");

		System.out.println("\n\n"+v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi()+"\n\n");
		System.out.println(v1.comparer(v2));
	}

}
