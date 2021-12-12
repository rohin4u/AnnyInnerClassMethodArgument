package com.spiderscrawl;

public class Test {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		o.m1(new Inner() {
		
			public void m2(String s) {
				System.out.println(s.toLowerCase());
				System.out.println("Thread Name inside main method:"+Thread.currentThread().getName());
			}
		
		});
	}
}
