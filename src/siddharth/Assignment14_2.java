package siddharth;

public class Assignment14_2 {
	void maxNumber(int input[]) {
		int min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (min > input[index]) {
				min = input[index];
			}
		}
		System.out.println("Minimum number is" + min);
	}

	public static void main(String[] args) {
		int[] input = { 1, 23, 55, 0, 97,-23 };
		Assignment14_2 assignment14_2 = new Assignment14_2();
		assignment14_2.maxNumber(input);
	}
}
