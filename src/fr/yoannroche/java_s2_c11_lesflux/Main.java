package fr.yoannroche.java_s2_c11_lesflux;


public class Main{
	public static void main(String[] args){
		Patisserie pat = new CoucheChocolat(
				new CoucheCaramel(
						new CoucheBiscuit(
								new CoucheChocolat(
										new Gateau()))));
		System.out.println(pat.preparer());
	}
}