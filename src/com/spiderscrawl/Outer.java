package com.spiderscrawl;

public class Outer {
	
	public void m1(Inner i)
	{
		i.m2("India is Best Country");
		System.out.println("Thread Name inside outer :"+Thread.currentThread().getName());
	}

}
