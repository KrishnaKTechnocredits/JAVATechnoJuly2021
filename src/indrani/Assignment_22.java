package indrani;

public class Assignment_22 {
	
	int getCountOfDigits(String input) {
		int countOfDigits = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				countOfDigits++;
		}
		return countOfDigits;
	}

	int getSumOfDigits(String input) {
		int sumOfDigits = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				sumOfDigits += Character.getNumericValue(input.charAt(index));
		}
		return sumOfDigits;
	}

	public static void main(String[] args) {
		Assignment_22 assignment22 = new Assignment_22();
		System.out.println(assignment22.getCountOfDigits("Te1ch2no3cr4ed3it4s"));
		System.out.println(assignment22.getSumOfDigits("Te11ch2no3cr4edi2ts"));
		
	}

}