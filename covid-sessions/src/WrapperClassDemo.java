// we can also use Integer class methods like parseInt to play with data 
class WrDemo {

}

public class WrapperClassDemo {
	public static void main(String[] args) {
		int i = 7; // primitive datatype
		Integer i1 = new Integer(7); // same as above line

		Integer i2 = new Integer(i); // boxing or wrapping (sending i into integer class)
		int j = i2.intValue();// unboxing or unwrapping, fetching value of i2 using intvalue() function 

		Integer i3 = i;// autoboxing
		int j1 = i3; // auto unboxxing
		
		// parseInt example
		
		String str="1009";
		Integer x=Integer.parseInt(str);
		
		System.out.print(x.getClass());

	}
}
