/* Assignment - 33 : 11th Sep'2021

*Program 1 : shift all non zeros at the end.*
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

*Program 2: place all negative numbers at the beginning and all positive numbers at the end.*
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.*
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

*program 4 : find the triple which in sequence and having maximum sum*

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12
*/

package harshada.Assignment_33;

import java.util.Arrays;

import javax.jws.soap.SOAPBinding;

public class Assignment_33 {

	int[] p1_shiftAllNonZerosAtEnd(int input[]) {

		int output[] = new int[input.length];
		int zeroCount = 0;

		for (int index = 0; index < input.length; index++) {

			if (input[index] == 0) {
				zeroCount++; // count number of zeros
			}
		}

		for (int index2 = 0; index2 < input.length; index2++) {
			if (input[index2] != 0) {
				// only store non zero, zero will be automatically placed in array for empty
				// indexes
				output[zeroCount] = input[index2];
				zeroCount++;
			}
		}

		return output;
	}

	int[] p2_shiftNegativeAtBegAndPositiveAtEnd(int input[]) {

		int output[] = new int[input.length];
		int negCount = 0;
		int temp = 0; // take this variable to store negative values

		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[temp] = input[index];
				negCount++;
				temp++;
			}
		}
		for (int index2 = 0; index2 < input.length; index2++) {
			if (input[index2] > 0) {
				output[negCount] = input[index2];
				negCount++;

			}
		}

		return output;
	}

	int[] p3(int input[]) {
		int output[] = new int[input.length];
		int zeroCount = 0, negCount = 0, posCount = 00;
		int temp = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[temp] = input[index];
				negCount++; // get negative number count
				temp++;
			}
		}

		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				output[negCount] = input[index];
				negCount++;
			}
		}

		posCount = zeroCount + negCount;

		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[posCount] = input[index];
				posCount++;
			}
		}
		return output;
	}

	void p4(int input[]) {

		int num1 = 0, num2 = 0, num3 = 0, sum = 0, maxSum = 0, maxIndex = 0;

		for (int index = 0; index < input.length - 2; index++) {
			num1 = input[index];
			num2 = input[index + 1];
			num3 = input[index + 2];

			if (num2 == num1 + 1 && num3 == num2 + 1) {

				sum = num1 + num2 + num3;

			}
			if (maxSum < sum) {
				maxSum = sum;
				maxIndex = index;
			}
		}
		System.out.println("Triplets with maximum sum are listed below: ");
		System.out.println("Number 1 = " + input[maxIndex]);
		System.out.println("Number 2 = " + (input[maxIndex] + 1)); // value concatenated when brackets are not provided
																	// like 102, 103
		System.out.println("Number 3 = " + (input[maxIndex] + 2));
		System.out.println("Sum  (Maximum sum ) of Above 3 numbers is : = " + maxSum);
	}

	// System.out.println(num1); it will give last values of array therefore take index and then add 1 and 2 to it. 
	// System.out.println(num2);
	// System.out.println(num3);
	// System.out.println(maxSum);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_33 obj = new Assignment_33();
		int input1[] = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		int output1[] = obj.p1_shiftAllNonZerosAtEnd(input1);
		System.out.println("Output of Program 1 : Shift Zero numbers at the beginning & Non Zeros at End of the Array");
		System.out.println(Arrays.toString(output1) + "\n");
		int input2[] = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		int output2[] = obj.p2_shiftNegativeAtBegAndPositiveAtEnd(input2);
		System.out.println("Output of Program 2 : Shift Negative numbers at the beginning & Non Zeros at End of the Array");
		System.out.println(Arrays.toString(output2) + "\n");
		int input3[] = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12, 0, 0, -2, 100 };
		int output3[] = obj.p3(input3);
		System.out.println("Output of Program 3 : Shift Negative numbers at the beginning & Zeros &  Non Zeros at End of the Array");
		System.out.println(Arrays.toString(output3) + "\n");
		System.out.println("Output of Program 4:");
		int input4[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		obj.p4(input4);
	}

}
