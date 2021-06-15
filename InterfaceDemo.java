
// In this example if we want to extends some more class let in badminton it will give error, not support multipkle inheritance
// use Interface for the implementation of Sports and use extends to add some other uses


// There are two ways to use interface 
//1. is to create another class that implements its methods and definition 
//2. Anonymous class

//Types of Interfaces
//1. Normal (use more than one method)
//2. Functional Interface (Single method)
//3.Marker Interface(no method)

class abc{
	
}

interface Sports{
	 void play();  // all methods in interface are public interface
	
}
class cricket implements Sports{
	public void play() {
		System.out.println("play cricket");
	}
}
class badminton extends abc implements Sports{
	public void play() {
		System.out.println("play badminton");
	}
}
class working{
	public void doSomething(Sports c) {
		c.play();
	}
}
public class InterfaceDemo {
	public static void main(String []args) {
		working wk=new working();
		Sports sb=new cricket();
		Sports bb=new badminton();
		//sb.play();
		wk.doSomething(sb);
	}
}
