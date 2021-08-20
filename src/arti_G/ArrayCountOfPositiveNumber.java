package arti_G;
/*Assignment 13 : 15th Aug'2021

program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3

program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};

output : 4


program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45*/

public class ArrayCountOfPositiveNumber {

	// 1st program
	int getPositiveNumber(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				count++;
			}
		}
		return count;
	}

	// 2nd Program
	int getZeroNumber(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				count++;
			}
		}
		return count;
	}

	// 3 program
	void getSmallerNumbers(int num) {
		int[] output = new int[5];
		for (int index = 0; index < 5; index++) {
			num--;
			output[index] = num;
			System.out.println(output[index]);
		}
	}

	public static void main(String[] args) {
		ArrayCountOfPositiveNumber arrayCountOfPositiveNumber = new ArrayCountOfPositiveNumber();
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.println("Positive numbers count from the given array is : ");
		System.out.println(arrayCountOfPositiveNumber.getPositiveNumber(input));

		ArrayCountOfPositiveNumber arrayCountOfPositiveNumber2 = new ArrayCountOfPositiveNumber();
		int[] arr = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.println("Zero numbers count from the given array is : ");
		System.out.println(arrayCountOfPositiveNumber2.getZeroNumber(arr));

		ArrayCountOfPositiveNumber arrayCountOfPositiveNumber3 = new ArrayCountOfPositiveNumber();
		System.out.println("5 smaller numbers of the given number are:");
		arrayCountOfPositiveNumber3.getSmallerNumbers(50);

	}
}
