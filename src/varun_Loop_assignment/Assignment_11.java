package varun_Loop_assignment;

public class Assignment_11 {
	int countForgnrt100num = 0;

	void printNPrimeNumbers(int number) {
		boolean flag;
		int count = 1;
		int num = 2;
		while (count <= number) {
			flag = true;
			for (int index = num - 1; index > 1; index--) {
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(num + " is prime number.");
				count++;
			}
			num++;
		}

	}

	void numberRequiredforSumMoreThan100(int range) {
		int number = 1;
		int sum = 0;

		while (sum < range) {
			sum = sum + number;
			number++;
			countForgnrt100num++;
		}
		System.out.println("Number required to generate a sum of more than 100 is " + countForgnrt100num);
	}

	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.numberRequiredforSumMoreThan100(100);
		assignment_11.printNPrimeNumbers(10);
	}
}