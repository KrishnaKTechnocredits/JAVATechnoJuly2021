/*
 Assignment - 31 : 9th Sep'2021
Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number

Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.

input : 20
output : 20 is not a perfect square.


Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66

Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ 
 */

package umakant;

import java.util.Arrays;

public class Assignment31 {

	private boolean isPerfectNumber(int input) {
		int sum = 1;
		for (int index = 2; index <= input / 2; index++) {
			if (input % index == 0)
				sum += index;
		}
		return input == sum;
	}

	void displayPerfectNumberOrNot(int input) {
		if (isPerfectNumber(input))
			System.out.println(input + " is a perfect number");
		else
			System.out.println(input + " is not a perfect number");
	}

	private boolean isPerfectSquare(int input) {
		int squareRoot = (int) Math.sqrt(input);
		return input == (squareRoot * squareRoot);
	}

	void displayPerfectSquareOrNot(int input) {
		if (isPerfectSquare(input))
			System.out.println(input + " is a perfect square");
		else
			System.out.println(input + " is not a perfect square");
	}

	int countOfTripletInSequence(int[] input) {
		int count = 0;
		int length = input.length;
		for (int index = 0; index < length - 2; index++) {
			if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2)
				count++;
		}
		return count;
	}

	void showPerfectNumberInGivenRange(int startIndex, int endIndex) {
		System.out.print("Perfect numbers are in range " + startIndex + " to " + endIndex + " are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (isPerfectNumber(index))
				System.out.print(index + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		assignment31.displayPerfectNumberOrNot(6);
		assignment31.displayPerfectNumberOrNot(50);
		assignment31.displayPerfectSquareOrNot(25);
		assignment31.displayPerfectSquareOrNot(20);
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		System.out.println(
				"Number of Triplet in " + Arrays.toString(arr) + " is " + assignment31.countOfTripletInSequence(arr));
		assignment31.showPerfectNumberInGivenRange(5, 170);
	}

}
