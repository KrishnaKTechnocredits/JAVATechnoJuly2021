package varun.varun_string_assignment;

public class TotalDigitsInGivenString {
	int count = 0;
	int sum =0;
	void countDigitFromGivenString(String str) {
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index)))
				count++;
		}
		System.out.println("Count of total digits from given string is "+count);
	}
	
	void sumOfAllDigitsFromGivenString(String str) {
		for(int index = 0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		System.out.println("Sum of total digits from the given string is " +sum);
	}
	
	public static void main(String[] args) {
		TotalDigitsInGivenString assignment_21_1 = new TotalDigitsInGivenString();
		String str = "Te1ch2no3cr4ed3it4s7asd";
		assignment_21_1.countDigitFromGivenString(str);
		assignment_21_1.sumOfAllDigitsFromGivenString(str);
	}
}
