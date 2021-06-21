// we can onely make methods in interface using default methods and also override it

@FunctionalInterface
interface Demotwo{
	void show();					// we can only make one method in it 
									// because we can use lambda expression then	
}

public class FunctionalInterfaceDemo {
	public static void main(String [] args) {
		
		
		Demotwo ab= ()-> System.out.println("in Lambda shortcut");	
		ab.show();
	}
}
