/*
 * Program 1: Find second highest number from array. int[] arr =
 * {10,23,2,11,55,43,99}; output : 55
 */
package mayur.Assignment_28;
import java.util.Arrays;

public class Assignment28 {
	
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
		Assignment28 assignment28 = new Assignment28();
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		assignment28.getSecondHighestNum(arr);

	}
}