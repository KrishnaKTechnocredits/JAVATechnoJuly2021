package purshottamJoshi;

public class CodingTest {
	int getSumOfDigits(String[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			for (int innerindex = 0; innerindex < input[index].length(); innerindex++) {
				if (Character.isDigit(input[index].charAt(innerindex)))
					sum += Character.getNumericValue(input[index].charAt(innerindex));
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		CodingTest codingtest = new CodingTest();
		String[] input = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println("Sum of digits in given array: "+codingtest.getSumOfDigits(input));
	}

}
