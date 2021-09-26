package madhavi;

public class PositiveNumber {

	int findPositiveNumber(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		PositiveNumber positiveNumber = new PositiveNumber();

		System.out.println("Count of postive number in given array");
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		System.out.println(positiveNumber.findPositiveNumber(input));

	}

}
