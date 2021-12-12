package com.spiderscrawl;

public class Inner {
	
	public void m2(String s)
	{
		System.out.println(s.toUpperCase());
		System.out.println("Thread Name inside inner :"+Thread.currentThread().getName());
	}

}
