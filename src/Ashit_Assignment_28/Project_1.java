/*
	 * Program 1: Find second highest number from array. int[] arr =
	 * {10,23,2,11,55,43,99}; output : 55
	 */

package Ashit_Assignment_28;
import java.util.Arrays;

public class Project_1 {

	void getSecondHighestNum(int arr[]) {
			int maxNum = arr[0];
			int secondMaxNum = arr[1];
			if (maxNum < secondMaxNum) {
				maxNum = arr[1];
				secondMaxNum = arr[0];
			}
			for (int index = 2; index < arr.length; index++) {
				if (maxNum < arr[index]) {
					secondMaxNum = maxNum;
					maxNum = arr[index];
				} else if (secondMaxNum < arr[index]) {
					secondMaxNum = arr[index];
				}
			}
			System.out.println("Second highest  number in given array" + Arrays.toString(arr) + " is : " + secondMaxNum);
		}

		public static void main(String[] args) {
			Project_1 program_1 = new Project_1();
			int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
			program_1.getSecondHighestNum(arr);

		}

	}
	

