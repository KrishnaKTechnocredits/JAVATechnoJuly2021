/*find closest negative number with respect to 8 
	int[] arr = {-3,11,123,-11,-9,-55,33,44};
	output : -3

	PR #101 -> time : 15 mins

	Branch name - Varun_coding_test_9*/
package shalaka.codingtest;

public class ClosestNumberToZero {
	public void getClosestNumberToZero(int[] arr) {
		int num = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0 && num < arr[index])
				num = arr[index];
		}
		System.out.println("Number closet to zero from given array: "+ num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3,11, 123, -11, -9, -55, -3, 44};
		new ClosestNumberToZero().getClosestNumberToZero(arr);
	}

}
