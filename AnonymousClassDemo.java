
//override the method show with anonymous class
// we can also create anonymous class for making object of abstract class

@FunctionalInterface
interface AbstractAnonymousDemo{
	void show();					// we can only make one method in it 
									// because we can use lambda expression then
	
}
class ann{
	public void show() {
		System.out.println("in show");
	}
}
public class AnonymousClassDemo {
	public static void main(String [] args) {
		ann obj=new ann() {
			public void show() {								// anonymous class
				System.out.println("in Anonymous class");
				}
			};
		obj.show();
		AbstractAnonymousDemo ab=new AbstractAnonymousDemo() {		// making abstract class object
			public void show() {									// using Anonymous class
				System.out.println("in Abstract shortcut");
			}
		};
		ab.show();
	}
}