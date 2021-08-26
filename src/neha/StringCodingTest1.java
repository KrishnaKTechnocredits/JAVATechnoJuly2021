package neha;

/*WAP to calculate sum of all the digit available in String array
String input[] = {“t2e4c”, “2h7no”, “3h6h2h5”, ”1mk3”, ”k9g8”}
int output = 52*/
public class StringCodingTest1 {
	static int sum = 0;

	int sumOfAllDigitsInStringArray(String[] stringArr) {

		for (int index = 0; index < stringArr.length; index++) {
			sum = sum + findDigitsSumInString(stringArr[index]);
		}
		return sum;
	}

	int findDigitsSumInString(String str) {
		int sumDigit = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sumDigit = sumDigit + Character.getNumericValue(ch);
			}
		}
		return sumDigit;

	}

	public static void main(String[] args) {
		StringCodingTest1 stringCodingTest1 = new StringCodingTest1();
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println("Sum of all digit available in String array is: "
				+ stringCodingTest1.sumOfAllDigitsInStringArray(input));
	}
}
