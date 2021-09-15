package nasir_Assignment_26;

public class SwapNumber {
	
	void getSwapNumber(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swap " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		SwapNumber swapNumber = new SwapNumber();
		int a = 10;
		int b = 20;
		System.out.println("Number before Swap " + a + " " + b);
		swapNumber.getSwapNumber(a, b);

	}

}
