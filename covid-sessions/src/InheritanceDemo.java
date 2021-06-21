// single and multilevel inheritance
//super() and its use 
// multiple inheritence is not supported in java(directly by classes) it causes ambiguity 

class one{
									// super,parent
	one(){
		System.out.println("Inside Super class constructor");
	}
	one(String s){
		System.out.println("Inside Super class parametrised constructor");
		//System.out.println(s);
	}
	void sub(int a,int b){
		System.out.println(a-b);	
	}
}
class two extends one{				//sub,child,derived
	two(){
		System.out.println("Inside Sub Class Constructor");
	}
	two(String s){
		super(s);
		System.out.println("Inside Sub class parametrised constructor");
		//System.out.println(s);
	}
	void  sum(int a,int b) {
		System.out.println(a+b);
	}
}
public class InheritanceDemo   {
	
	public static void main(String [] args) {
		two t1=new two("inside parameterised constructor");
		t1.sum(1,9);
		//sub(7, 9);
	}
	
	
}
