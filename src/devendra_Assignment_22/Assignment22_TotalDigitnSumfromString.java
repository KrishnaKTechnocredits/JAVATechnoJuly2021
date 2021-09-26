package devendra_Assignment_22;

public class Assignment22_TotalDigitnSumfromString {
	int getTotalDigitsInString(String input) {
		
		int countDigit = 0;
		
		for(int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index))){
				countDigit++;
			}
		}
		return countDigit;
	}

	int getAllDigitSum(String input) {
		
		int sum = 0;
		
		for(int index = 0; index < input.length(); index++) {
			if(Character.isDigit(input.charAt(index))){
				sum += Character.getNumericValue(input.charAt(index));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		String input1 = "Te1ch2no3cr4ed3it4s";
		String input2 = "Te11ch2no3cr4edi2ts";
		
		Assignment22_TotalDigitnSumfromString assignment22 = new Assignment22_TotalDigitnSumfromString();
		System.out.println("The String is " +input1 );
		System.out.println("Total Digits in a String is:" +assignment22.getTotalDigitsInString(input1));
		System.out.println("----------------------------------------------------");
		System.out.println("The String is " +input2 );
		System.out.println("Sum of All the digits in a String is: "+assignment22.getAllDigitSum(input2));
	}
}
