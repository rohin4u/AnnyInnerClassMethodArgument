package com.country;

public class Outer {
	
	int x = 10;
	static String y = "India";
	public static class Inner
	
	{
		public void m2() {
			System.out.println("inside inner class");
			System.out.println(y);
		
		}
		
		
	}

}
