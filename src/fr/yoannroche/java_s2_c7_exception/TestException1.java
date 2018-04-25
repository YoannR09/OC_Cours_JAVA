package fr.yoannroche.java_s2_c7_exception;


public class TestException1 {


	public static void main(String[] args){
		Capitale cap = new Capitale();
		System.out.println(cap.decrisToi());
		Ville v = null;
		try {                   
			v = new Ville("Re", 12000, "France");           
		}
		//Gestion de plusieurs exceptions différentes
		catch (NombreHabitantException | NomVilleException e2){ 
			System.out.println(e2.getMessage());		     
		}
		finally{
			if(v == null)
				v = new Ville();
		}        
		System.out.println(v.toString());
	}
}