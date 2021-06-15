// abstract classes are made only for the classes to extend it , to use its methods , we cannot create obj of these classes 
// we can only create abstract methods inside abstract class
// we can see example of Number class which is a abstract class and Integer and Float extends it . we canot create object of number but we can use its reference sometimes.

abstract class AbDemo{
	int a;           // we can also create simple methods in abstract class ,not in interface
	void check() { 
		
	}
	
	//only declare abstract methods
	public abstract void check_two();
}
class AbDemoPart_two extends AbDemo	// concrete class
{
	// compulsory to define it  
	public void check_two() {};
	 
}
public class AbstractClassDemo {
	public static void main(String [] args) {
		
		AbDemo ab=new AbDemoPart_two();
	
	}
}
