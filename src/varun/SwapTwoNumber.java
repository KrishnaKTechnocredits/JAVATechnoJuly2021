package varun;

public class SwapTwoNumber {
	void swapNumberWth3rdVariable(int x, int y) {
		System.out.println("Value of x is  " + x + " Value of y is " + y);
		int z = x + y; // 30
		x = z - x; // 20
		y = z - x; // 10

		System.out.println("After swapping with 3rd variable  \nvalue of x is  " + x + "\nValue of y is " + y);
	}
	
	void swapNumberWithout3rdVariable(int x, int y) {
		x = x+y; //30
		y = x-y;//10
		x = x-y;//20
		System.out.println("After swapping without 3rd variable  \nvalue of x is  " + x + "\nValue of y is " + y);
	}

	public static void main(String[] args) {
		SwapTwoNumber swapTwoNumber = new SwapTwoNumber();
		swapTwoNumber.swapNumberWth3rdVariable(10, 20);
		swapTwoNumber.swapNumberWithout3rdVariable(10, 20);
	}
}
