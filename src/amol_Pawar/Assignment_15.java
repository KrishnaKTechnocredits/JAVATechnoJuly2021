package amol_Pawar;

public class Assignment_15 {

	void getDiffEvenAndOddLength(String arr[]) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0)
				evenSum = evenSum + arr[index].length();
			else {
				oddSum = oddSum + arr[index].length();
			}
		}
		if (evenSum > oddSum) {
			int diff = evenSum - oddSum;
			System.out.println("Difference between even and odd length name is: " + diff);
		} else {
			int diff = oddSum - evenSum;
			System.out.println("Difference between even and odd length name is: " + diff);
		}
	}

	void getMiddleChar(String[] arr) {
		char middleChar = ' ';
		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
			if (name.length() % 2 == 0) {
				middleChar = name.charAt(name.length() / 2-1);
				System.out.println("Middle character of word " + name + " : " + middleChar);
			} else {
				middleChar = name.charAt(name.length() / 2 );
				System.out.println("Middle character of word " + name + " : " + middleChar);
			}
		}
	}

	void getDiffSumOfEvenAndOddNum(int input[]) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < input.length; index++) {

			if (input[index] % 2 == 0)
				evenSum = evenSum + input[index];
			else
				oddSum = oddSum + input[index];
		}
		if (oddSum > evenSum) {
			int diff = oddSum - evenSum;
			System.out.println("Differnce between odd sum " + oddSum + " and even sum " + evenSum + " is : " + diff);
		} else {
			int diff = evenSum - oddSum;
			System.out.println("Differnce between even sum " + evenSum + " and odd sum " + oddSum + " is : " + diff);
		}
	}

	public static void main(String[] args) {
		Assignment_15 assignment_15 = new Assignment_15();
		String arr[] = { "Maulik", "Techno", "Nidhi", "Ankit" };
		assignment_15.getDiffEvenAndOddLength(arr);
		String[] str = { "hello", "techno", "credits" };
		assignment_15.getMiddleChar(str);
		int[] input = { 12, 2, 13, 9 };
		assignment_15.getDiffSumOfEvenAndOddNum(input);
		int[] input1 = { 13, 22, 10, 3 };
		assignment_15.getDiffSumOfEvenAndOddNum(input1);

	}
}

/*Assignment 15 : 16th Aug'2021


*program 1*:  wap that will return difference of even length name and odd lenght name.
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

