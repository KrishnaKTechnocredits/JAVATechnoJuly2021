package shalaka.Assignment22;

public class SumOfDigits {
	int getSumOfDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Te11ch2no3cr4edi2ts";
		SumOfDigits sumOfDigits = new SumOfDigits();
		int sum = sumOfDigits.getSumOfDigits(str);
		System.out.println("sum of all the digits in a given string is " + sum);
	}
}
