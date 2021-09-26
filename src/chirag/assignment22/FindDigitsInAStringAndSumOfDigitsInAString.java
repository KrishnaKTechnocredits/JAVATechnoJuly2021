package chirag.assignment22;

public class FindDigitsInAStringAndSumOfDigitsInAString {
	
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
		FindDigitsInAStringAndSumOfDigitsInAString findDigitsInAStringAndSumOfDigitsInAString = new FindDigitsInAStringAndSumOfDigitsInAString();
		String str = "Te1ch2no3cr4ed5it6s";
		System.out.println("-----------------Programm : 1----------------");
		System.out.println("Given String : "+str);
		System.out.println("Total digits in a given string : "+findDigitsInAStringAndSumOfDigitsInAString.getDigits(str));
		System.out.println("-----------------Programm : 2----------------");
		System.out.println("Given String : "+str);
		System.out.println("Sum of all the digits in a given string : "+findDigitsInAStringAndSumOfDigitsInAString.sumOfDigitsInGivenString(str));
	}

}
