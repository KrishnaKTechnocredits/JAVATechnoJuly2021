package amol_Pawar;

public class Assignment_11 {
	int count = 0;

	void getPrimeNum(int num) {

		boolean flag = true;
		int index = 2;
		while (index < num) {

			if (num % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if (flag) {
			System.out.print(num + ",");
			count++;
		}
	}

	void setNum(int num) {
		int index = 2;
		while (num > count) {
			getPrimeNum(index);
			index++;
		}
	}

	void sumOfNumbers() {
		int sum = 0;
		int count = 0;
		int index = 1;
		while (sum < 100) {
			sum = sum + index;
			index++;
			count++;
		}
		System.out.println("Total required numbers to generate sum more than 100 are : " + count);
	}

	public static void main(String args[]) {
		Assignment_11 assignment_11 = new Assignment_11();
		System.out.print("First 10 prime numbers are : ");
		assignment_11.setNum(10);
		System.out.println();
		assignment_11.sumOfNumbers();

	}

}

/*
 * Assignment - 11 : 13th Aug'2021 While loop
 * 
 * Program 1: Print first N prime numbers. N should be passed as parameter in
 * the method. Hint : 10 pass as parameter, method should print first 10 prime
 * numbers.
 * 
 * Program 2: Write a method to find out required numbers to generate sum more
 * than 100. output : 14
 */