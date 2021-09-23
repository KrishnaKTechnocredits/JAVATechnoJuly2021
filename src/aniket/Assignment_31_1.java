package aniket;

//Verify the given number is perfect number or not
public class Assignment_31_1 {

	Boolean isPerfectNumber(int number) {
		//boolean flag = true;
		int sum = 0;
		for (int index = 1; index <= number / 2; index++) {
			if (number % index == 0) {
				sum += index;
			}
		}
		if (sum == number) {
			System.out.println(number + " is perfect number");
			return true;
		} else {
			System.out.println(number + " is not perfect number");
			return false;
		}

	}

	public static void main(String[] args) {
		//Assignment_31_1 assignment_31_1 = new Assignment_31_1();
		System.out.println(new Assignment_31_1().isPerfectNumber(6));
		// assignment_31_1.isPerfectNumber(6));
		//assignment_31_1.isPerfectNumber(10);

	}
}