/*Program : 3 
swap 2 numbers with using 3rd variable*/

package amol_Vyas.Assignment_26;

public class SwapUsingThirdVariable {

	void swapNumbers(int a, int b) {
		System.out.println("Value of two numbers before swapping " + a + " " + b);
		int c = 0;
		c = b;
		b = a;
		a = c;
		System.out.println("Value of two numbers after swapping " + a + " " + b);
	}

	public static void main(String[] args) {
		SwapUsingThirdVariable swapUsingThirdVariable = new SwapUsingThirdVariable();
		swapUsingThirdVariable.swapNumbers(10, 20);
	}
}
