package neha.assignment_28;

import java.util.Arrays;

/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55*/
public class SecondHighestNo {
	int findSecondHighestNo(int[] inpArr) {
		int maxNo;
		int secondMaxNo;
		if (inpArr[0] > inpArr[1]) {
			maxNo = inpArr[0];
			secondMaxNo = inpArr[1];
		} else {
			maxNo = inpArr[1];
			secondMaxNo = inpArr[0];
		}
		for (int index = 2; index < inpArr.length; index++) {
			if (maxNo < inpArr[index]) {
				secondMaxNo = maxNo;
				maxNo = inpArr[index];
			} else if (secondMaxNo < inpArr[index]) {
				secondMaxNo = inpArr[index];
			}
		}
		return secondMaxNo;
	}

	public static void main(String[] args) {
		SecondHighestNo secondHighestNo = new SecondHighestNo();
		// int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		int[] arr = { 10, 33, 44, 37, 11, 30, 12 };
		System.out.println("Second highest No in given array " + Arrays.toString(arr) + " is "
				+ secondHighestNo.findSecondHighestNo(arr));
	}
}
