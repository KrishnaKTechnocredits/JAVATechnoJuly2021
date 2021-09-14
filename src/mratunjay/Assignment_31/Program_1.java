package mratunjay.Assignment_31;

public class Program_1 {

	void getThePerfectNumber(int N) {

		int sum = 0;
		for (int index = 1; index < N; index++) {

			if (N % index == 0) {

				sum += index;
			}
		}
		if (sum == N) {

			System.out.println("Number is perfect number:   " + N);

		}

	}

	public static void main(String[] args) {

		Program_1 P_1 = new Program_1();
		P_1.getThePerfectNumber(6);

	}

}
