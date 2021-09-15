/*Assignment - 31 : 9th Sep'2021
Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number

Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.

input : 20
output : 20 is not a perfect square.


Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66

Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ */

package amol_Vyas;

public class Assignment_31 {

	boolean isPerfectNumber(int number) {
		int sum = 1;
		boolean flag = false;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == number)
			return flag = true;
		else
			return flag = false;
	}

	void isPerfectSquare(int number) {
		int num = (int) Math.sqrt(number);
		if (number == (num * num))
			System.out.println(number + " is a perfect sqaure");
		else
			System.out.println(number + " is not a perfect sqaure");
	}

	void getCountTripletsInGivenArray(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2)
				count++;
		}
		System.out.println("Number of triplets in given array is " + count);
	}

	void getPerfectNumberFromGivenRange(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (isPerfectNumber(index))
				System.out.println(index + " is a perfect number");
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		Assignment_31 assignment_31 = new Assignment_31();
		int num = 6;
		if (assignment_31.isPerfectNumber(num))
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number");
		num = 50;
		assignment_31.isPerfectNumber(num);
		if (assignment_31.isPerfectNumber(num))
			System.out.println(num + " is a perfect number");
		else
			System.out.println(num + " is not a perfect number");
		assignment_31.isPerfectSquare(25);
		assignment_31.isPerfectSquare(20);
		assignment_31.getCountTripletsInGivenArray(input);
		assignment_31.getPerfectNumberFromGivenRange(1, 170);
	}
}
