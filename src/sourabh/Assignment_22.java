package sourabh;



public class Assignment_22 {
	
	int getTotalDigitsFromNumber(String input) {
		int countDigit = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				countDigit++;
			}
		}
		return countDigit;
	}

	int getSumOfTotalDigits(String input1) {
		int sum = 0;
		for (int index = 0; index < input1.length(); index++) {
			if (Character.isDigit(input1.charAt(index))) {
				sum += Character.getNumericValue(input1.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_22 assignment22 = new Assignment_22();
		String input = "Te1ch2no3cr4ed3it4s";
		String input1 = "Te11ch2no3cr4edi2ts";
		System.out.println("Total digits in a '" + input + "' string is " + assignment22.getTotalDigitsFromNumber(input));
		System.out.println("Sum of all the digits in a '" + input1 + "' string is " + assignment22.getSumOfTotalDigits(input1));
		
	}

}
