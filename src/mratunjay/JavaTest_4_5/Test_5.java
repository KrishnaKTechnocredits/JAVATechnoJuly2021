package mratunjay.JavaTest_4_5;

public class Test_5 {

	int count = 0;

	void getThePerfectNumber(int N) {

		int sum = 0;
		for (int index = 1; index < N; index++) {

			if (N % index == 0) {

				sum += index;
			}
		}
		if (sum == N) {

			System.out.println("Number is perfect number:    " + N);
			count++;
		}

	}

	void getFirstFivePerfectNumbers(int N) {

		int i = 1;
		while (count < 5) {
			getThePerfectNumber(i);

			i++;
		}

	}

	public static void main(String[] args) {

		Test_5 T_5 = new Test_5();
		T_5.getFirstFivePerfectNumbers(5);

	}

}
