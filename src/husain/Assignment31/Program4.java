package husain.Assignment31;

import java.util.Arrays;

public class Program4 {

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

	void numbers(int startRange, int endRange) {

		int arr[] = new int[5];
		System.out.println("The list of perfect numbers between " + startRange + " and " + endRange + " is ");
		for (int index = startRange; index < endRange; index++) {
			if (isPerfectNum(index)) {
				System.out.println(index);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program4 obj = new Program4();
		obj.numbers(20, 8200);

	}

}
