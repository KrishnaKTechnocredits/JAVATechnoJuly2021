package arti_G;

/*Assignment 15 : 16th Aug'2021
program 1:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
		
arr[1] = "Techno";
		
arr[2] = "Nidhi";
		
arr[3] = "Ankit";

output : 2

program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}

Hint : charAt method of String class helps to retrieve character on given index


program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.

int[] arr = {12,2,13,9}

hint : 22 - 14 = 8

output : 8

int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16*/
/*Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4

Two assignments for today and another two for Monday.

Create a new branch for every assignment.
Create a separate class for every program.
Ex - For assignment 13 create one branch called yourName_Assignment_13
And push 3 java files of each program.*/
public class Assignment_15 {

	int even = 0;
	int odd = 0;
	int difference = 0;
	//1 program
	int getDifferenceBetweenEvenAndOddLength(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int ans = arr[index].length();
			if (ans % 2 == 0) {
				even = even + ans;
			} else {
				odd = odd + ans;
			}
			if (even > odd) {
				difference = even - odd;
			} else {
				difference = odd - even;
			}

		}
		return difference;
	}

	// 2 program
	char[] getMiddleCharacter(String[] str) {
		char[] output = new char[str.length];
		for (int index = 0; index < str.length; index++) {
			int ans = str[index].length();
			if (ans % 2 == 0) {
				int middleChar = (ans / 2) - 1;
				output[index] = str[index].charAt(middleChar);
			}
			if (ans % 2 != 0) {
				int middleChar = (ans / 2);
				output[index] = str[index].charAt(middleChar);
			}
		}
		return output;
	}

	// 3 program
	int getDifferenceBetweenEvenSumAndOddSum(int[] input) {

		for (int index = 0; index < input.length; index++) {

			if (input[index] % 2 == 0) {
				even = even + input[index];
			}
			if (input[index] % 2 != 0) {
				odd = odd + input[index];
			}
		}
		if (even > odd) {
			difference = even - odd;
		} else {
			difference = odd - even;
		}
		return difference;
	}

	public static void main(String[] args) {

		Assignment_15 assignment_15 = new Assignment_15();
		String[] arr = { "Maulik", "Techno", "Nidhi", "Ankit" };
		System.out.println("Return difference of even length name and odd lenght name");
		System.out.println(assignment_15.getDifferenceBetweenEvenAndOddLength(arr));

		Assignment_15 assignment_15_1 = new Assignment_15();
		String[] str = { "hello", "techno", "credits" };
		System.out.println("Return middle char of all elements of the String array");
		System.out.println(assignment_15_1.getMiddleCharacter(str));

		Assignment_15 assignment_15_2 = new Assignment_15();
		int[] input = { 12, 2, 13, 9 };
		System.out.println("Return difference between sum of even number - sum of odd numbers");
		System.out.println(assignment_15_2.getDifferenceBetweenEvenSumAndOddSum(input));
	}

}
