package neha.assignment_26;

/*Program : 4 
swap 2 numbers without using 3rd variable*/
public class SwapNumberProgram2 {
	static int num1 = 10;
	int num2 = 20;

	static void swapNumbers() {
		SwapNumberProgram2 swapNumberObj1 = new SwapNumberProgram2();
		SwapNumberProgram2 swapNumberObj2 = new SwapNumberProgram2();
		System.out.println("Numbers " + num1 + " and " + swapNumberObj1.num2 + " after swapping are: ");
		swapNumberObj1.num2 = num1;
		num1 = swapNumberObj2.num2;
		System.out.println(num1 + " and " + swapNumberObj1.num2);
	}

	public static void main(String[] args) {
		swapNumbers();
	}
}
