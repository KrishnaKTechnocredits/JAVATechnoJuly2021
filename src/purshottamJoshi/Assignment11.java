package purshottamJoshi;

public class Assignment11 {
	int countNumbers = 0;

	void printNPrimeNumbers(int number) {
		boolean flag;
		int count = 1;
		int num = 2;
		while (count <= number) {
			flag = true;
			int index = num - 1 ;
			while(index >1) {
				if (num % index == 0) {
					flag = false;
					break;
				}
				index--;
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
			countNumbers++;
		}
		System.out.println("Number required to generate a sum of more than 100 is " + countNumbers);
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.numberRequiredforSumMoreThan100(100);
		assignment11.printNPrimeNumbers(10);
	}
}