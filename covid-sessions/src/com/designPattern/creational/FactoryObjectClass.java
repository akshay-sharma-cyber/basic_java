package com.designPattern.creational;

public class FactoryObjectClass {
	public Mobile mediumObj(String st) {
		if(st.equals("expensive")) {
			return new Apple();
		}
		else if(st.equals("average")){
			return new Nokia();
		}
		else { return new Lava();}
		
	}
}
