package vivek.Assignment22;

public class Assignment22_2 {

	int sumOfDigitsInString(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum = sum + Character.getNumericValue(str.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment22_2 assignment22_2 = new Assignment22_2();
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("Sum of digits in the given string is " + assignment22_2.sumOfDigitsInString(str));
	}
}
