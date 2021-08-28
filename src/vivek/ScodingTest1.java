package vivek;

public class ScodingTest1 {

	int sumOfDigitsInString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				sum += Character.getNumericValue(str.charAt(index));
		}
		return sum;
	}

	int sumOfDigitsInArray(String[] str) {
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			sum += sumOfDigitsInString(str[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		ScodingTest1 scodingTest1 = new ScodingTest1();
		String[] str = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		System.out.println(scodingTest1.sumOfDigitsInArray(str));
	}
}
