/* Assignment - 26 : 1st Sep'2021

Program : 3 
swap 2 numbers with using 3rd variable

Program : 4 
swap 2 numbers without using 3rd variable
 */

package sayli_Vyavhare.Assignment_26;

public class SwapWithAndWithoutThirdVariable {

	void swapUsingThirdVariable(int num1, int num2) {
		int temp = 0;
		System.out.println("Numbers before swapping are: " + num1 + " " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swapping are: " + num1 + " " + num2);

	}

	void swapWithoutThirdVariable(int num1, int num2) {
		System.out.println("Numbers before swapping are: " + num1 + " " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Numbers after swapping are: " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapWithAndWithoutThirdVariable swap = new SwapWithAndWithoutThirdVariable();
		swap.swapUsingThirdVariable(5, 6);
		System.out.println("-------------------------------------------------------");
		swap.swapWithoutThirdVariable(9, 15);
	}
}
