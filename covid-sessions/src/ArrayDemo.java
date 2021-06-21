// 1-D array , 2-D array , Array of objects
// for each loop
// Variable arguments( ... )
class newArray{
	
	//int arraytest[]=new int[10];

	int arraytest[]= {22,1,0,3,55,6,5};
	//int two_d[][]=new int[2][4];
	int two_d[][]= {
			{232,110,3,55,5},
			{224,1,0,3,55,609,5},
			{242,13,55,6,51},
			{22,1,0,3}
	};
	
	// Variable arguments
	void sum(int ... n) {
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	void printArray(){
		
		//for(int i=0;i<arraytest.length;i++) {
		//	System.out.println(arraytest[i]);		
		//}
		
		// for each loop
		for(int k:arraytest) {
			System.out.println(k);
		}
		
		for(int ar[]:two_d) {
			for(int val:ar) {
				System.out.print(" "+val);
			}
			System.out.println("\n");
		}
	}
}

public class ArrayDemo {
	public static void main(String [] args) {
		
		newArray s[]=new newArray[4];// array of objects
		//s[0]=new newArray;
		
		newArray obj=new newArray();
		obj.sum(2,3,4,5,6);
		//obj.printArray();
	}
}
