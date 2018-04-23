package fr.yoannroche.java_s2_c2;

public class Capitale extends Ville {
	private String monument;
	 
	  public Capitale(){
	    //Ce mot clé appelle le constructeur de la classe mère  
	    super();
	    monument = "aucun";
	  } 

	public String toString(){
		  String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
		  return str;
		  }
	 public String decrisToi(){
		    String str =  super.decrisToi() + "\n \t ==>>" + this.monument+ " en est un monument";
		    System.out.println("Invocation de super.decrisToi()");
		    
		    return str;
		   }
	 public Capitale(String nom, int hab, String pays, String monument){
		    super(nom, hab, pays);
		    this.monument = monument;
		  }
	
}
