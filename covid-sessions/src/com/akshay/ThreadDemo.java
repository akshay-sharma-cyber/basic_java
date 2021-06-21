// 2 methods to use thread 
// extends Thread
//use Runnable interface(Functional Interface) because sometimes we need to use mutliple inheritance



package com.akshay;
class hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("hii");
		try {Thread.sleep(1000);}catch(Exception ae) {}
			}
		}
	
}
class hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello");	
			try {Thread.sleep(1000);}catch(Exception ae) {}		
		}	
	}
}
public class ThreadDemo {
	public static void main(String [] args) {
		hi h1=new hi();
		hello h2=new hello();
		
		// Runnable have not this method Start()
		h1.start();
		try {Thread.sleep(10);}catch(Exception ae) {}
		h2.start();
	}
}
