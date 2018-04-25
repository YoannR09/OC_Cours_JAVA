package fr.yoannroche.java_s2_c7_exception;

public class TestException1 {

	public static void main(String[] args) {

		//-- Test des arguments d'entrées de la méthode main(...)
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//-- Utilisation d'un tableau simple
		int tabInt[] = {18,19,20};
		for (int i=0;i<3;i++) {
			System.out.println(tabInt[i]);
		}
		for (int valeur :tabInt) {
			System.out.println(valeur);
		}
		
		//-- Test d'une exception Java
		int j = 20, i = 0;

		try {
			System.out.println(j/i);
		} catch (ArithmeticException e) {
			System.out.println("Division par zéro !");
			e.printStackTrace();
		}
		System.out.println("coucou toi !");
	}
}