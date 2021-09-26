package avinash.assignment26;
/*
Program : 4 
swap 2 numbers without using 3rd variable
 */

import java.util.Scanner;

public class SwappingNumbers {
	void swapNumbers(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping two number:" + "num1 is " + num1 + " num2 is " + num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwappingNumbers swappingNumbers = new SwappingNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		System.out.println("Enetr num2");
		int num2 = sc.nextInt();
		swappingNumbers.swapNumbers(num1, num2);

	}

}
