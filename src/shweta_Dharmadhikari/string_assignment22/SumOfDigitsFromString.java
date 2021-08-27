package shweta_Dharmadhikari.string_assignment22;

public class SumOfDigitsFromString {

	int getSumOfDigits(String input) {
		int sum =0;
		for (int index=0;index<input.length();index++)
		{
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String str = "Te11ch2no3cr4edi2ts";
		SumOfDigitsFromString sumOfDigitsFromString = new SumOfDigitsFromString();
		System.out.println("Sum of all digits in a given string is : "+sumOfDigitsFromString.getSumOfDigits(str));
		
	}

}
