package fr.yoannroche.java_s2_c5;

public class Chat extends Felin {
	 
	  public Chat(){

	  }
	  public Chat(String couleur, int poids){
	    this.couleur = couleur;
	    this.poids = poids;
	  }
	        
	  void crier() {
	    System.out.println("Je miaule sur les toits !");
	  } 
	}
