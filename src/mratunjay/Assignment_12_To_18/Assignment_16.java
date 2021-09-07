package mratunjay.Assignment_12_To_18;

public class Assignment_16 {

	int getCountVisibleTree(int[] input) {
		int count = 0;
		int max = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max) {
				max = input[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 5, 11, 9, 10, 15, 14 };
		Assignment_16 A_16 = new Assignment_16();
		System.out.println("The visible count of tree is " + A_16.getCountVisibleTree(input));
	}
}

