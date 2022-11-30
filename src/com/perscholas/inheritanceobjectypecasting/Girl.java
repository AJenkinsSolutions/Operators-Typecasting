package com.perscholas.inheritanceobjectypecasting;

public class Girl  extends Person{
	static double agefactor = 1.1;
	
	public Girl(String aName) {
		this.name = "Ms." + aName;
	}
	
	public String talk() {
	       return("Hello! " + jump());
	   }
	   public String jump() {
	       return("I am jumping.");
	   }
	   public static double lifeSpan() {
	       return(lifeSpan * ageFactor);
	   }

}
