package umakant;

public class Assignment14_3 {

	int getDifferenceBetweenMaxAndMin(int[] input) {
		int max = input[0];
		int min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
			else if (input[index] < min)
				min = input[index];
		}
		return (max - min);
	}

	public static void main(String[] args) {
		Assignment14_1 assignment14_1 = new Assignment14_1();
		Assignment14_2 assignment14_2 = new Assignment14_2();
		Assignment14_3 assignment14_3 = new Assignment14_3();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println(assignment14_3.getDifferenceBetweenMaxAndMin(input));
		System.out.print(assignment14_1.getMaximum(input) - assignment14_2.getMinimum(input));// Using getMaximum and
																								// getMinimum function
																								// return in different
																								// class
	}
}
