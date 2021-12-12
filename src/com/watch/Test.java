package com.watch;

public class Test {

	public static void main(String[] args)throws Exception {
		
		new Thread(new Runnable() {
			public void run() {
				for(int i=0 ; i<5; i++)
				{
				try {
					System.out.println("inside anonymous child Thread");
					
					Thread.sleep(2000);
				}catch(Exception e) {}
				
				}
			}
		}).start();
		
		for(int i=0; i<5; i++) {
			
			System.out.println("main method implementation");
			Thread.sleep(2000);
		}
		

	}

}
