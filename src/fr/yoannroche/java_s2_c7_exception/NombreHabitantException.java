package fr.yoannroche.java_s2_c7_exception;

class NombreHabitantException extends TestException1{ 
	public NombreHabitantException(){
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
	}  
}