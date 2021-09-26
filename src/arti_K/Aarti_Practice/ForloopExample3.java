// Print in reverse order

package arti_K.Aarti_Practice;

public class ForloopExample3 {
	
	void printNumReverse() {  
		int index=5;
		for( ; index>=1; index--)		//Without for loop brackets
			System.out.println(index);
		System.out.println("Hi");
	}
	
	void printNumReverseOrder() {  
		int index=5;
		for( ; index>=1; index--) {		//With for loop brackets
			System.out.println(index);
			System.out.println("Hi");
		}
	}
	
	public static void main(String[] args) {
		ForloopExample3 example =  new ForloopExample3();
		example.printNumReverse();
		System.out.println("-------------------------------");
		example.printNumReverseOrder();
	}
}
