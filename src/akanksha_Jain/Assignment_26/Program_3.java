package akanksha_Jain.Assignment_26;

public class Program_3 {
	
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
		Program_3 program_3 = new Program_3();
		program_3.swapNumbersUsingThirdVariable(10, 20);
	}
}
