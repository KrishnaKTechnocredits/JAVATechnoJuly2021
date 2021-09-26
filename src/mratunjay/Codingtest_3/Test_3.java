package mratunjay.Codingtest_3;

public class Test_3 {

	int input[] = { 25, 14, 56, 15, 36, 77, 18, 29, 49 };

	void removeElementFromArray(int[] input, int A) {

		for (int index = 0; index < input.length; index++) {

			if (input[index] == A) {

				input[index] = input[index + 1];
				index++;
			}

			System.out.println("output Array: " + input[index]);
		}
	}

	public static void main(String[] args) {

		Test_3 T3 = new Test_3();
		T3.removeElementFromArray(T3.input, 14);

	}

}
