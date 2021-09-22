/* Assignment - 28 : 4th Sep'2021

 Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55
 
Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/

package astha.Assignment28;

public class Assignment28 {

	void get2ndHighestNumber(int[] input) {

		int highestNum = input[0];
		int secondHighestNum = input[1];
		if (input[0] < input[1]) {
			highestNum = input[1];
			secondHighestNum = input[0];
		}

		for (int index = 2; index < input.length; index++) {
			if (input[index] > highestNum) {
				secondHighestNum = highestNum;
				highestNum = input[index];
			} else if (input[index] > secondHighestNum)
				secondHighestNum = input[index];
		}
		System.out.println("The second highest number is : " + secondHighestNum);
	}
	
	int getHighestNumInArray(int[] arr) {
		int maxNum = 0;
		int maxIndex = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNum) {
				maxNum = arr[index];
				maxIndex = index;
			}
		}
		arr[maxIndex] = 0;
		return maxNum;
	}

	int getNthHighestNumber(int[] input, int n) {
		int nthMaxNum = 0;
		for (int index = 0; index < n; index++) {
			nthMaxNum = getHighestNumInArray(input);
		}
		return nthMaxNum;
	}
		

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		int[] inputArr = { 10, 23, 2, 11, 55, 43, 99 };
		int num = 3;
		assignment28.get2ndHighestNumber(inputArr);
		int nMaxNum = assignment28.getNthHighestNumber(inputArr, num);
		System.out.println("The "+ num + "rd highest number is "+ nMaxNum);
	}
}
