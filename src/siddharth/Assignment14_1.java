package siddharth;

public class Assignment14_1 {
	void maxNumber(int input[]) {
		int max = input[0];
		for(int index = 0; index < input.length; index++) {
			if (max < input[index]) {
				max = input[index];
			}
		}
		System.out.println("Maximum number is" + max);
	}

	public static void main(String[] args) {
		int[] input = {1,23,55,0,97};
		Assignment14_1 assignment14_1 = new Assignment14_1();
		assignment14_1.maxNumber(input);

	}
}
