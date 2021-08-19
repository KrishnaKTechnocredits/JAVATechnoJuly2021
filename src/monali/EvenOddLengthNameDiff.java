package monali;

public class EvenOddLengthNameDiff {

	// *program 1*: wap that will return difference of even length name and odd
	// lenght name.

	int diffEvenandOddLengthNames(String[] input) {
		int evenLength = 0;
		int oddLength = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0)
				evenLength += input[index].length();
			else
				oddLength += input[index].length();

		}
		return evenLength - oddLength;
	}

	int processData() {
		String[] arr = new String[4];
		arr[0] = "Maulik";
		arr[1] = "Techno";
		arr[2] = "Nidhi";
		arr[3] = "Ankit";

		return diffEvenandOddLengthNames(arr);

	}

	public static void main(String[] args) {
		EvenOddLengthNameDiff diffEvenAndOddLengthNames = new EvenOddLengthNameDiff();
		System.out.println("Difference between even and odd length names : " + diffEvenAndOddLengthNames.processData());
	}
}
