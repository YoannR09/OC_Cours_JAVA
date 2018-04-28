package fr.yoannroche.java_s2_c11_lesflux;

import java.io.Serializable;

public class Notice implements Serializable {
	private String langue ;
	public Notice() {
		this.langue = "Francais";
	}
	public Notice(String lang) {
		this.langue = lang;
	}
	public String toString() {
		return "/\t Langue de la notice : " +this.langue + "\n";
	}
}
