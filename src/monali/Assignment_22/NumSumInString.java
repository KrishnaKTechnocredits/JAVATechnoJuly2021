package monali.Assignment_22;

public class NumSumInString {

	int numbersSumInString(String str) {

		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		NumSumInString sumNumInString = new NumSumInString();
		// String str="1mo2n3a4l2i55";
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("Sum of numbers present in String : " + sumNumInString.numbersSumInString(str));
	}
}
