package com.designPattern.creational;

public class FactoryPatternDemo {
	public static void main(String [] args) {
		
		FactoryObjectClass mb=new FactoryObjectClass();			// We need to change object every time for diff mobiles
										// Client will see when we change main method
		Mobile mm=mb.mediumObj("old");
		mm.show();
	}
}
