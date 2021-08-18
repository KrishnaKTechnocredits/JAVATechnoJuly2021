package trupti;

public class Assignment_13 {

	void displayPositiveNoCount(int[] num) {
		int count = 0;
		//System.out.println("Array length is: " + num.length);
		for (int index = 0; index < num.length; index++) {
			if (num[index] > 0) {
				count++;
			}
		}
		System.out.println("Total positive no in array: " + count);
	}

	void toCountZeroNo(int[] num) {
		int zeroCount = 0;
		//System.out.println("Array length is: " + num.length);
		for (int index = 0; index < num.length; index++) {
			if (num[index] == 0) {
				zeroCount++;
			}
		}
		System.out.println("Total zero no in array: " + zeroCount);
	}

	void getSmallerNo(int num) {
		int count = 5;
		for (int index = 0; index < count; index++) {
			//if (count <= 5) {
				num--;
				System.out.println(num);
			//}
		}
	}

	public static void main(String[] args) {
		Assignment_13 assignment_13_1 = new Assignment_13();
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		assignment_13_1.displayPositiveNoCount(input);

		System.out.println("...................................................... ");

		Assignment_13 assignment_13_2 = new Assignment_13();
		int[] zeroInput = { 1, -11, 0, 0, 55, 0, -23, 0 };
		assignment_13_2.toCountZeroNo(zeroInput);

		System.out.println("...................................................... ");

		Assignment_13 assignment_13_3 = new Assignment_13();
		assignment_13_3.getSmallerNo(50);

	}
}
