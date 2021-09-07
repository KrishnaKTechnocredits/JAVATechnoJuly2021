package nasir_Assignment_26;

public class SwapNumberWithoutExtraVariable {

	void getSwapNumber(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("Numbers after swap " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		SwapNumberWithoutExtraVariable swapNumberWithoutExtraVariable = new SwapNumberWithoutExtraVariable();
		int a = 30;
		int b = 20;
		System.out.println("Number before Swap " + a + " " + b);
		swapNumberWithoutExtraVariable.getSwapNumber(a, b);

	}

}
