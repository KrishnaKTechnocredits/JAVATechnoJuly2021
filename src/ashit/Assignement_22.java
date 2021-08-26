package ashit;

public class Assignement_22 {
	int count = 0;
	int sum =0;
	void countDigitFromGivenString(String str) {
		for(int index=0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index)))
				count++;
		}
		System.out.println("Count of  digits in given string is "+count);
	}

	void sumOfAllDigitsFromGivenString(String str) {
		for(int index = 0;index<str.length();index++) {
			if(Character.isDigit(str.charAt(index))) {
				sum += Character.getNumericValue(str.charAt(index));
			}
		}
		System.out.println("Sum of  digits in the given string is " +sum);
	}

	public static void main(String[] args) {
		Assignement_22 assignment_22 = new Assignement_22();
		String str = "Te1ch2no3cr4ed3it4s7asd";
		assignment_22.countDigitFromGivenString(str);
		assignment_22.sumOfAllDigitsFromGivenString(str);
	}
}
