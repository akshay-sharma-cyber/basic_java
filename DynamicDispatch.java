//Polymorphism
// Dynamic Dispatch

class A1{
	A1(){
		System.out.println("A const");
	}
	void show(){
		System.out.println("A");
	}
	void check() {
		System.out.println("check ");
	}
}
class B1 extends A1{
	B1(){
		System.out.println("B const");
	}
	void show(){
		System.out.println("B");
	}
//	void check() {
//		System.out.println("check ");
//	}
}
class C extends A1{
	C(){
		System.out.println("C const");
	}
	void show(){
		System.out.println("C");
	}
}
public class DynamicDispatch {
	public static void main(String [] args) {
		A1 obj=new B1();// run time polymorphism
		obj.show();
		obj.check();
		obj=new C();
		obj.show();
	}
}
