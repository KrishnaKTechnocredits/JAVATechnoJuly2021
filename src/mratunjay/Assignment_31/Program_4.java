package mratunjay.Assignment_31;

public class Program_4 {

	int count = 0;

	void getThePerfectNumber(int N) {

		int sum = 0;
		for (int index = 1; index < N; index++) {

			if (N % index == 0) {

				sum += index;
			}
		}
		if (sum == N) {

			System.out.println("Number is perfect number:   " + N);
			count++;
		}

	}

	void getFirstFivePerfectNumbers(int N) {

		for (int i = 20; i <= N; i++) {
			getThePerfectNumber(i);

		}

	}

	public static void main(String[] args) {

		Program_4 P_4 = new Program_4();
		P_4.getFirstFivePerfectNumbers(170);

	}

}
