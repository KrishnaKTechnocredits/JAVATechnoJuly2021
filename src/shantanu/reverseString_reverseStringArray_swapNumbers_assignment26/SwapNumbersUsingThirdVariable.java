package shantanu.reverseString_reverseStringArray_swapNumbers_assignment26;

public class SwapNumbersUsingThirdVariable {
	void swapNumbers(int num1, int num2) {
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1:"+num1+" "+"num2:"+num2);
	}
	void displaySwappedNumbers(int num1, int num2) {
		System.out.println("----------After Swap----------");
		swapNumbers(num1,num2);
	}
	public static void main(String[] args) {
		SwapNumbersUsingThirdVariable swapNumbersUsingThirdVariable = new SwapNumbersUsingThirdVariable();
		int num1 = 10;
		int num2 = 20;
		System.out.println("-----------Before Swap-----------");
		System.out.println("num1:"+num1+" "+"num2:"+num2);
		swapNumbersUsingThirdVariable.displaySwappedNumbers(num1,num2);
	}
}
