/*Program : 4 
swap 2 numbers without using 3rd variable*/

package amol_Vyas.Assignment_26;

public class SwapWithoutVariable {

	void swapWithoutVariable(int a, int b) {
		System.out.println("Value of two numbers before swapping " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of two numbers after swapping " + a + " " + b);
	}

	public static void main(String[] args) {
		SwapWithoutVariable swapWithoutVariable = new SwapWithoutVariable();
		swapWithoutVariable.swapWithoutVariable(12, 20);
	}
}
