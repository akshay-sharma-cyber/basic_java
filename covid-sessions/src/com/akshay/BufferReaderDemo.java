// Whatever comes from io package is a resource and needs to be closed 
// In this example we need to use br.close();

//try with resource, using try alone with the help of passing Buffer in try only

package com.akshay;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class BufferReaderDemo  {
	//throws Exception
	public static void main(String [] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a1=sc.nextInt();
		System.out.println(a1);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number");
		try {
			int a=Integer.parseInt(br.readLine());
			System.out.println(a);
			
		}
		catch(Exception ae){
		System.out.println(ae);
		}
		finally {
			br.close();// this also throws a exception thats why we can use "throws"
		}
	}
}