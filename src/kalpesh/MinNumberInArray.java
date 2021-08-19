package kalpesh;

public class MinNumberInArray {
	static int min = 100;

	int findMinNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] < min)
				min = input[index];
		}
		return min;
	}

	public static void main(String[] args) {
		MinNumberInArray minnumberinarray = new MinNumberInArray();
		int[] input = { 1, 11, 44, 23, 55, 99, 23, };
		System.out.println("Minimum Number From The Given Array Is " + minnumberinarray.findMinNumber(input));

	}

}
