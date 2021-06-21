//throws : keyword used to supress the error(not handling)
// use throw : when u want to force compiler to throw an error


package com.akshay;

public class TryCatchDemo {
	public static void main(String []args) {
		int a=10;
		int b=0;
		int c[]=new int[5];
		try {
			c[5]=11;
			System.out.println(a/b);
			System.out.println("Line after error");
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error comes in way");
		}
//		catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println("Index out Error comes in way");
//		}
		finally {
			System.out.println("Line comes after");
		}
		
	}
}
