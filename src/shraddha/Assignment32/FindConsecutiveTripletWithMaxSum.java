/*Assignment - 32 : 10th Sep'2021

Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/

package shraddha.Assignment32;

import java.util.Arrays;

public class FindConsecutiveTripletWithMaxSum {

	public static void main(String[] args) {
		int[] inputArray = { 10, 64, 65, 66, 23, 24, 25, 26, 61, 62 };
		FindConsecutiveTripletWithMaxSum newObject = new FindConsecutiveTripletWithMaxSum();
		newObject.getConsecutiveTripletsInArray(inputArray);

	}

	void getConsecutiveTripletsInArray(int[] inputArray) {
		int number1;
		int number2;
		int number3;
		int count = 0;
		int sum = 0;
		int temp = 0;
		int bigNumber1 = 0;
		int bigNumber2 = 0;
		int bigNumber3 = 0;
		System.out.println("input array is :- " + Arrays.toString(inputArray));
		for (int index = 0; index < inputArray.length - 2; index++) {
			number1 = inputArray[index];
			number2 = inputArray[index + 1];
			number3 = inputArray[index + 2];
			if (number2 - number1 == 1 && number3 - number2 == 1) {
				count++;
				System.out.println(number1 + " " + number2 + " " + number3);
				sum = number1 + number2 + number3;
				if (temp < sum) {
					temp = sum;
					bigNumber1 = number1;
					bigNumber2 = number2;
					bigNumber3 = number3;
				}
			}
		}
		if (count != 0) {
			System.out.println("there are " + count + " consecutive triplets in above array");
			System.out.println("Maximum sum " + temp + " is coming from this triplet [" + bigNumber1 + " " + bigNumber2
					+ " " + bigNumber3 + "]");
		} else
			System.out.println("there are no consecutive triplets in above array");
	}
}
