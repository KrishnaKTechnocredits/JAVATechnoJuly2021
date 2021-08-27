package avinash.stringassignment;

public class SumofDigitsInGivenString {

	int sumofDigitsInGivenString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;

	}

	int sumofDigitsInGivenArray(String[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum += sumofDigitsInGivenString(arr[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input[] = { "t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8" };
		SumofDigitsInGivenString sumofDigitsInGivenString = new SumofDigitsInGivenString();
		System.out.println(
				"sum of digits in given string array is:" + sumofDigitsInGivenString.sumofDigitsInGivenArray(input));

	}

}
