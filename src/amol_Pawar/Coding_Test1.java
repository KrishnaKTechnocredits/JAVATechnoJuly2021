package amol_Pawar;

public class Coding_Test1 {

	int getSumOfDigits(String input) {
		int sum = 0;
		int Allsum = 0;
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}

		return sum;

	}

	void getAllString(String input[]) {
		int Allsum = 0;
		for (int index = 0; index < input.length; index++) {
			Allsum += getSumOfDigits(input[index]);
		}

		System.out.println("Sum of digits " + Allsum);
	}

	public static void main(String[] args) {

		Coding_Test1 coding_Test1 = new Coding_Test1();
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };

		coding_Test1.getAllString(input);
	}

}
