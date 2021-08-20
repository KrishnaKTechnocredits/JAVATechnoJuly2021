package bhagyashree;

public class Assignment15 {

	// wap that will return difference of even length name and odd lenght name.
	int getEvenOddLengthDiff(String[] array) {
		int evensum = 0;
		int oddsum = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index].length() % 2 == 0) {
				evensum = evensum + array[index].length();
			} else {
				oddsum = oddsum + array[index].length();
			}

		}
		return evensum - oddsum;

	}

	// return middle char of all elements of the String array.
	void getMiddleCharofString(String[] array) {
		char middlechar;
		for (int index = 0; index < array.length; index++) {
			if (array[index].length() % 2 == 0) {
				middlechar = array[index].charAt((array[index].length() / 2) - 1);
			} else
				middlechar = array[index].charAt(array[index].length() / 2);
			System.out.println("Middle character of" + array[index] + " is: " + middlechar);
		}

	}

	// return difference between sum of even number - sum of odd numbers. Difference
	// has to be positive. print the answer in main method.
	int getDiffOfSumOfEvenandOdd(int[] array) {
		int result;
		int evensum = 0;
		int oddsum = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] % 2 == 0) {
				evensum = evensum + array[index];
			} else
				oddsum = oddsum + array[index];
		}
		if (evensum - oddsum > 0)
			return evensum - oddsum;
		else
			return oddsum - evensum;

	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Techno", "Nidhi", "Ankit" };
		Assignment15 assignment15 = new Assignment15();
		System.out
				.println("Difference between even and odd length sum is: " + assignment15.getEvenOddLengthDiff(input));

		String[] input1 = { "hello", "techno", "credits" };
		assignment15.getMiddleCharofString(input1);

		int[] input3 = { 12, 2, 13, 9 };
		System.out.println("Difference between sum of even number and odd number is: "
				+ assignment15.getDiffOfSumOfEvenandOdd(input3));

	}
}
