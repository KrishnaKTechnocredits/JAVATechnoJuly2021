/*
 * Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
 */
package umakant;

public class Assignment28 {

	int getSecondHighest(int[] input) {
		int max, secondMax;
		if (input[0] > input[1]) {
			max = input[0];
			secondMax = input[1];
		} else {
			max = input[1];
			secondMax = input[0];
		}
		for (int index = 2; index < input.length; index++) {
			if (input[index] > max) {
				secondMax = max;
				max = input[index];
			} else if (input[index] != max && input[index] > secondMax) {
				secondMax = input[index];
			}
		}
		return secondMax;
	}

	int getHigestAndSetZero(int[] input) {
		int max = input[0];
		int maxIndex = 0;
		for (int index = 1; index < input.length; index++) {
			if (input[index] > max) {
				max = input[index];
				maxIndex = index;
			}
		}
		input[maxIndex] = 0;
		return max;
	}

	int getNthHighest(int[] input, int highest) {
		int nthHighest = 0;
		while (highest > 0) {
			nthHighest = getHigestAndSetZero(input);
			highest--;
		}
		return nthHighest;
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 2, 11, 55, 43, 99 };
		Assignment28 assignment28 = new Assignment28();
		System.out.println(assignment28.getSecondHighest(input));
		System.out.println(assignment28.getNthHighest(input, 3));
	}
}
