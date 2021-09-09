package husain.CodingTest_5;

import java.util.Arrays;

public class PerfectFive {

	boolean isPerfectNum(int input) {

		int num = input;
		int sum = 0;
		for (int index = 1; index < input; index++) {
			if (input % index == 0)
				sum = sum + index;
		}

		if (sum == num)
			return true;
		else
			return false;

	}

	void findPerfectFive() {

		int count = 0;
		int i = 6;
		int arr[] = new int[5];

		while (count < 5) {
			if (isPerfectNum(i)) {
				arr[count] = i;
				count++;

			}
			i++;
		}
		System.out.println("The first 5 perfect numbers are " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PerfectFive obj = new PerfectFive();
		obj.findPerfectFive();

	}

}
