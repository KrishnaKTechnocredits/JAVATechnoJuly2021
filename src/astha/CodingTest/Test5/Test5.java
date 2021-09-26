package astha.CodingTest.Test5;

public class Test5 {

	boolean checkPerfectNumber(int number) {
		boolean flag = false;
		int sum = 1;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (number == sum)
			// System.out.println(number+ "is a perfect number");
			flag = true;
		return flag;
	}

	void getPerfectNumber(int number) {
		int count = 0;
		int index = 2;
		while (count <= number) {
			if (checkPerfectNumber(index) == true) {
				System.out.print(index + " ");
				count++;
			}
			index++;
		}
	}

	public static void main(String[] args) {
		Test5 test5 = new Test5();
		System.out.println("The perfect numbers are : ");
		test5.getPerfectNumber(5);

	}
}
