package shalaka.Assignment26;

public class SwapWithoutThirdVariable {
	int[] swapTwoNumbers(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		// System.out.println("The value of x after swap is: " + x);
		// System.out.println("The value of y after swap is: " + y);
		return new int[] { x, y };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int y = 500;
		SwapWithoutThirdVariable swapWithoutThirdVariable = new SwapWithoutThirdVariable();
		int arr[] = swapWithoutThirdVariable.swapTwoNumbers(x, y);
		System.out.println("Values of x & y before swapping are " + x + " " + y + " respectively");
		System.out.println("Values of x & y after swapping are " + arr[0] + " " + arr[1] + " respectively");
	}
}
