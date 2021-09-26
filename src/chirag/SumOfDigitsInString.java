package chirag;

public class SumOfDigitsInString {
	
	int sumOfDigits(String input) {
		int sum=0;
		for(int index=0 ; index< input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum=sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	int display(String [] input) {
		int totalSumOfDigits=0;
		for(int index = 0 ;index < input.length;index++) {
			totalSumOfDigits = totalSumOfDigits + sumOfDigits(input[index]);
		}
		return totalSumOfDigits;
	}
	public static void main(String[] args) {
		SumOfDigitsInString sumOfDigitsInString=new SumOfDigitsInString();
		String [] input = {"t2ec4c","2h7no","3h6h2h5","1mk3","k9g8"};
		System.out.println("Sum of all digits in a given string :"+sumOfDigitsInString.display(input));
	}
}
