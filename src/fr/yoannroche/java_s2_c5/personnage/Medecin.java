package fr.yoannroche.java_s2_c5.personnage;

import fr.yoannroche.java_s2_c5.comportement.*;

public class Medecin extends Personnage{
	  public Medecin() {
	    this.soin = new PremierSoin();
	  }
	  public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep) {
	    super(esprit, soin, dep);
	  }	
	}
