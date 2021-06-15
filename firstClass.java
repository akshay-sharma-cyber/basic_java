// SOMEBASIC CASES AND PATTERNS
class New{
	//Switch does not support double
	//String is also not support in switch below 1.8
	void switchTesting() {
		char check='C';
		switch(check) {
		case 'A':System.out.println("This is A");
			break;
		case 'B':System.out.println("This is B");
			break;
		default:System.out.println("error");
			break;
		}
	}
}
public class firstClass {
	/*
	  	Arithmetic +, -,%,*,/ 
	  	Bitwise  << >>
	  	Relational
	  	Logical
	 */
	public static void main(String[] args) {
		//New ne=new New();
		//ne.switchTesting();
		//System.out.println("hello");
		int a=10;
		float b=a;
		//		int c=b;
		//		float d=4.9f;
		//		double r=99.989;
		//		int sum=2;
		//		System.out.println(d);
		//		System.out.println(r);
		//		sum=+a;
		System.out.println("pattern one");
		for(int i=1;i<7;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			System.out.println("\n");
		}
		System.out.println("pattern two");
		char character='A';
		for(int i=1;i<7;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(character);
				character++;
			}
			character='A';
			System.out.println("\n");
		}
		System.out.println("pattern three");
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				if((i==2&&j==2||i==2&&j==3)||(i==3&&j==2||i==3&&j==3)) {
					System.out.print(' ');
					continue;
				}
				System.out.print('$');
			}
			System.out.println("\n");
		}
		
	}
}
