package avinash.assignment26;

/*Program : 3 
swap 2 numbers with using 3rd variable
 * 
 * 
 */
import java.util.Scanner;

public class SwappingofTwoNumbers {

	void swapNumbers(int num1, int num2) {
		int num3;
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("After swapping two number:" + "num1 is " + num1 + " num2 is " + num2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwappingofTwoNumbers swappingofTwoNumbers = new SwappingofTwoNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enetr num2");
		int num2 = sc.nextInt();
		swappingofTwoNumbers.swapNumbers(num1, num2);

	}

}
