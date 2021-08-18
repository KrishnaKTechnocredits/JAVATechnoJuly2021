package varun_array_assignment;

public class DiffOfEvnLngthNameAndOddLengthName {
	int evenLength;
	int oddLength;

	void evenLengthName(String[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0)
				evenLength = evenLength + input[index].length();
			else
				oddLength = oddLength + input[index].length();
		}
	}

	void differenceInEvenOddLength() {
		System.out.println("Even length from the given array is " + evenLength);
		System.out.println("Odd length from the given array is " + oddLength);
		int diff = evenLength - oddLength;
		System.out.println("Difference of even length name and odd length name from the given array is " + diff);
	}

	public static void main(String[] args) {
		DiffOfEvnLngthNameAndOddLengthName assignment15 = new DiffOfEvnLngthNameAndOddLengthName();
		String[] input = { "Maulik", "techno", "Varun", "joshi" };
		assignment15.evenLengthName(input);
		assignment15.differenceInEvenOddLength();
	}
}
