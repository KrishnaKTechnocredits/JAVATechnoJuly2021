/*Programming Questions - Collections : 4th Oct'2021

Example 1 : 
Write a program to find given number is present in the arrayList or not.*/

package shraddha.Assignment46;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNumberPresentInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(53);
		al.add(72);
		System.out.println(al);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a number to check if it is present in given ArrayList :- ");
			try {
				int inputNumber = sc.nextInt();
				if (al.contains(inputNumber))
					System.out.println("Hurray!! " + inputNumber + " is present in given ArrayList");
				else
					System.out.println("Sorry !! " + inputNumber + " is NOT present in given ArrayList");
			} catch (InputMismatchException ie) {
				System.out.println("Invalid Input !!");
				break;
			}
		}
	}
}
