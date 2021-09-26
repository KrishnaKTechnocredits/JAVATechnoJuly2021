package neha.assignment_26;
/*Program : 3 
swap 2 numbers with using 3rd variable*/

public class SwapNumberProgram1 {

	int[] swapNumbersUsingVar(int num1, int num2) {
		int tempInt;
		tempInt = num1;
		num1 = num2;
		num2 = tempInt;
		return new int[] { num1, num2 };
	}

	public static void main(String[] args) {
		SwapNumberProgram1 swapNumberProgram1 = new SwapNumberProgram1();
		int num1 = 15;
		int num2 = 20;
		System.out.println("Numbers " + num1 + " and " + num2 + " post swapping using 3rd variable are: ");
		int[] swappedNums = swapNumberProgram1.swapNumbersUsingVar(num1, num2);
		System.out.println(swappedNums[0] + " and " + swappedNums[1]);
	}
}
