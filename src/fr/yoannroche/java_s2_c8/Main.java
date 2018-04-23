package fr.yoannroche.java_s2_c8;

public class Main {
	  public static void main(String args[]){
	    for(Langage lang : Langage.values()){
	      if(Langage.JAVA.equals(lang))
	        System.out.println("J'aime le : " + lang);
	      else
	        System.out.println(lang);
	    }
	  }
	}
