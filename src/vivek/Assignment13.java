package vivek;

public class Assignment13 {

	void getPositiveNumberCount(int[] input) {

		int cnt = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0)
				cnt++;
		}

		System.out.println("Count of positive numbers in the given array is " + cnt);
	}

	void getNumberOfZero(int[] input) {

		int cnt = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				cnt++;
		}

		System.out.println("\nCount of zeroes in the given array is " + cnt);
	}

	void get5SmallerNumbers(int number) {
		System.out.println("\n5 smaller numbers than " + number + " are :");
		for (int index = number - 1; index > number - 6; index--) {
			System.out.println(index);
		}
	}

	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();

		int[] arr1 = { 1, -11, -44, 23, 55, -99, -23, -22 };
		assignment13.getPositiveNumberCount(arr1);

		int[] arr2 = { 1, -11, 0, 0, 55, 0, -23, 0 };
		assignment13.getNumberOfZero(arr2);

		assignment13.get5SmallerNumbers(50);
	}

}
