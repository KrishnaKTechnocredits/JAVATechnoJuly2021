package akshay;

public class SumofArrayDigit {
	
	int getArrayDigitSum(String input) {
		int sum = 0;
		char ch = 0;
		for(int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if(Character.isDigit(ch))
				sum = Character.getNumericValue(ch) + sum;
		}
		return sum;
	}
	
	int setInput(String[] str) {
		int sum = 0;
		for(int index = 0; index < str.length; index++) {
			sum = sum + getArrayDigitSum(str[index]);
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		SumofArrayDigit sum = new SumofArrayDigit();
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("Total sum of digits in given string: " +sum.setInput(input));
		
	}
}
