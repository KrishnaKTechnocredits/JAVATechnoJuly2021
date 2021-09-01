package monali.Assignment_26;

import java.util.Scanner;

/*Program : 4 
swap 2 numbers without using 3rd variable*/

public class SwapNumbersWithout3rdVariable {

	void swapNumWithout3rdVar(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swapped values are : " + a + " " + b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers");
		new SwapNumbersWithout3rdVariable().swapNumWithout3rdVar(sc.nextInt(), sc.nextInt());
		sc.close();
	}
}
