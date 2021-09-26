package kalpesh;

public class Assignment_26_Program_3 {
	void swapNumbersUsingThirdVariable(int a, int b) {
		System.out.println("Before swap:- ");
		System.out.println("Value of a=" + a + ", Value of b=" + b);
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After swap:- ");
		System.out.println("Value of a=" + a + ", Value of b=" + b);
	}

	public static void main(String[] args) {
		Assignment_26_Program_3 program_3 = new Assignment_26_Program_3();
		program_3.swapNumbersUsingThirdVariable(10, 20);
	}

}

/*Program : 3 
swap 2 numbers with using 3rd variable
*/