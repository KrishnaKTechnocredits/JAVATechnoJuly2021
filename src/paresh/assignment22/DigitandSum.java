package paresh.assignment22;

/*Assignment - 22 : 25th Aug'2021

Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6

Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13*/

public class DigitandSum {
	int getDigits(String input) {
		int digitsCount=0;
		for(int index=0; index < input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				digitsCount++;
			}
		}
		return digitsCount;
	}
	
	int sumOfDigitsInGivenString(String input) {
		int sum = 0;
		for(int index = 0;index < input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				sum = sum + temp;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		DigitandSum digitAndSum = new DigitandSum();
		String str = "Te1ch2no3cr4ed5it6s";
		
		System.out.println("Given String : "+str);
		System.out.println("Total digits in a string : "+digitAndSum.getDigits(str));
		String str1 = "Te11ch2no3cr4edi2ts";
		System.out.println("Given String : "+str1);
		System.out.println("Sum of all the digits in a string : "+digitAndSum.sumOfDigitsInGivenString(str1));
	}

}