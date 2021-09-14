package dattaraj;

public class Scoding_Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scoding_Test5 test5 = new Scoding_Test5();
		test5.printFirstNPerfectNumber(5);
	}
	
	int count = 0;

	void isPerfectNum(int number) {
		int sum = 0;
		for (int index = 1; index < number; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == number) {
			count++;
			System.out.println(number + " is a perfect number");
		}
	}

	void printFirstNPerfectNumber(int num) {
		int number = 1;
		while (count <= num) {
			isPerfectNum(number);
			number++;
		}
	}

}
