// Static keyword , Constructor, Constructor overloading(Method overloading is same)
// static block


class Test1{
	int a=10;
	int b=20;
	static String name1;
	//constructor overloading
	
	Test1()// it will load when we create objects
	{
		System.out.println("inside constructor");
	}
	Test1(int a){
		System.out.println("inside constructor two");
		System.out.println("A1 is "+a);
		this.a=a+12;
		System.out.println("a is : "+this.a);
	}
	static // it only load once while class loading
	{
		System.out.println("in static block");
	}
	static void showName() {
//		name1="vashu";
		System.out.println(name1);
	}
}
public class ConstructorTesting {
	public static void main(String []args) {
		Test1 t1=new Test1(66);
		//Test1 t2=new Test1();
		//t1.name1="akshay";
		//t2.name1="gullu";
		Test1.name1="vashu";
		Test1.showName();
		//t1=new Test1(11);
		//t1.showName();
		//t2.showName();
		
	}
}
