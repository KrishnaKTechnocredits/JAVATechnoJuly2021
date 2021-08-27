package nasir_Assignment_22;

public class TotalDigits {
	int getDigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				count++;
		}
		return count;
	}
	int sumOfDigits(String str) {
		int sum=0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				sum += Character.getNumericValue(str.charAt(index));
			}
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		TotalDigits totalDigits = new TotalDigits();
		String input = "Te1ch2no3cr4ed3it4s";
		int count = totalDigits.getDigits(input);
		System.out.println("Total digits in " + input + "- " + count);
		String input1 = "Te11ch2no3cr4edi2ts";
		int sum = totalDigits.sumOfDigits(input1);
		System.out.println("Sum of all the digits given in the string " + input1 + "-" + sum);
	}

}
