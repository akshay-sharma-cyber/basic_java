// inner class , inner static class
// how to access inncer class by outer class methods

class Outer{
	Outer(){
		System.out.println("Inside Outer constructor ");
	}
	//static class
	//member class
	//Anonymous class
	static class Inner{
		Inner(){
			System.out.println("Inside static Inner class constructor ");
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		System.out.println("Inside Main ");
		Outer obj=new Outer();
		// to access the inner class with member class
		//Outer.Inner obj1=obj.new Inner();
		
		// access static inner class
		Outer.Inner obj1=new Outer.Inner();
	}
}
