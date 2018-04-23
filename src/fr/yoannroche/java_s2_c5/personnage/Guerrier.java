package fr.yoannroche.java_s2_c5.personnage;

import fr.yoannroche.java_s2_c5.comportement.*;

public class Guerrier extends Personnage {	
	  public Guerrier(){
	    this.espritCombatif = new CombatPistolet();
	  }
	  public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep) {
	    super(esprit, soin, dep);
	  }
	}
