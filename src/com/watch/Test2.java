package com.watch;

public class Test2 {

	public static void main(String[] args) {
		
		new Animal(new Dog() {
			public void sound()
			{
				System.out.println("Dogs Bark");
			}
		}).speak();

	}

}
