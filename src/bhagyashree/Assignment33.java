package bhagyashree;

import java.util.Arrays;

public class Assignment33 {

	/*
	 * Program 1 : shift all non zeros at the end. input :
	 * {1,0,3,4,0,2,88,0,0,22,34}; output : [0,0,0,0,1,3,4,2,88,22,34]
	 * 
	 */
	void shiftZonZerosAtEnd(int[] array) {
		int zerocount = 0;
		int[] output = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			if (array[index] == 0) {
				zerocount++;
			}
		}
		int outputindex = zerocount;
		for (int index = 0; index < array.length; index++) {
			if (array[index] != 0) {
				output[outputindex] = array[index];
				outputindex++;
			}
		}
		System.out.println("Array after shifting zeros's at Start: " + Arrays.toString(output));
	}

	/*
	 * Program 2: place all negative numbers at the beginning and all positive
	 * numbers at the end. input = {1,-3,-2,11,44,55,-76,33,12}; output :
	 * [-3,-2,-76,1,11,44,55,33,12]
	 * 
	 */

	void placePositiveAndNegativeNumbers(int[] array) {
		int negativeNumber = 0;
		int[] output = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			if (array[index] < 0) {
				output[negativeNumber] = array[index];
				negativeNumber++;
			}
		}

		int outputindex = negativeNumber;
		for (int index = 0; index < array.length; index++) {
			if (array[index] >= 0) {
				output[outputindex] = array[index];
				outputindex++;
			}
		}
		System.out.println(
				"Array after shifting negative number first and after positive number: " + Arrays.toString(output));
	}

	/*
	 * program 3: place all negative numbers at the beginning, zeros and all
	 * positive numbers at the end. input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
	 * output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
	 * 
	 */

	void printAllNegZeroAndPositive(int[] array) {
		int zerocnt = 0;
		int positivecnt = 0;
		int negcnt = 0;
		int[] output = new int[array.length];

		for (int index = 0; index < array.length; index++) {
			if (array[index] < 0) {
				output[negcnt] = array[index];
				negcnt++;
			} else if (array[index] == 0) {
				// output[zerocnt]=array[index];
				zerocnt++;
			}
		}
		positivecnt = zerocnt + negcnt;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > 0) {
				output[positivecnt] = array[index];
				positivecnt++;
			}
		}

		System.out.println("Array after Shifting negative,zero and positive in sequence: " + Arrays.toString(output));
	}

	/*
	 * program 4 : find the triple which in sequence and having maximum sum
	 * 
	 * input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99}; iteration : 3,4,5 9,10,11
	 * 10,11,12 1,2,3 output : 10,11,12
	 * 
	 */
	void getTripletMaxSum(int[] array) {

		int sum = 0;
		int maxsum = 0;
		int start = 0;
		for (int index = 0; index < array.length - 2; index++) {
			if (array[index] == array[index + 1] - 1 && array[index] == array[index + 2] - 2) {
				System.out.print(array[index] + " " + array[index + 1] + " " + array[index + 2] + "\n");
				sum = array[index] + array[index + 1] + array[index + 2];
				System.out.println("Sum for triplet is:" + sum);
				if (sum > maxsum) {
					maxsum = sum;
					start = index;

				}
			}

		}
		int[] output = new int[3];
		int count = 0;
		for (int index = start; index < start + 3; index++) {
			output[count] = array[index];
			count++;
		}
		System.out.println(Arrays.toString(output) + " is a triplet having maximum sum" + " And sum is:" + maxsum);
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		Assignment33 ass33 = new Assignment33();
		ass33.shiftZonZerosAtEnd(input);

		int[] input1 = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		ass33.placePositiveAndNegativeNumbers(input1);

		int[] input3 = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		ass33.printAllNegZeroAndPositive(input3);

		int[] input4 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		ass33.getTripletMaxSum(input4);
	}

}
