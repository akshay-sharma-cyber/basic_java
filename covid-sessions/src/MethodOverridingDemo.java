

class A{
	void show() {
		System.out.println("A");
	}
}
class B extends A{
	
	@Override
	void show() {
		super.show();// if we still want to call show() of class A
		System.out.println("B");
	}
}
public class MethodOverridingDemo {
	public static void main(String [] args) {
		B obj=new B();
		obj.show();
	}
}
