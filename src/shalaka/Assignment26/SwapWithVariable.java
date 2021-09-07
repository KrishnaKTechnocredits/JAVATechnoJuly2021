package shalaka.Assignment26;

public class SwapWithVariable {

	void SwapNumbers(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("The value of x after swap is: " + x);
		System.out.println("The value of y after swap is: " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		SwapWithVariable swapWithVariable = new SwapWithVariable();
		swapWithVariable.SwapNumbers(x, y);
	}
}
