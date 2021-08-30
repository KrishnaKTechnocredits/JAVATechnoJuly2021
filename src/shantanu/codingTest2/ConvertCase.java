package shantanu.codingTest2;

public class ConvertCase {
	String getStringWithConvertedCase(String input) {
		String str = "";
		for(int index = 0; index < input.length(); index++) {
			if(Character.isUpperCase(input.charAt(index))) 
				str += String.valueOf(Character.toLowerCase(input.charAt(index)));
			else if(Character.isLowerCase(input.charAt(index)))
				str += String.valueOf(Character.toUpperCase(input.charAt(index)));
			else if(Character.isDigit(input.charAt(index))) 
				str += String.valueOf(input.charAt(index));
		}
		return str;
	}
	void displayStringWithConvertedCase(String input) {
		System.out.println("String after case conversion: "+getStringWithConvertedCase(input));
	}
	public static void main(String[] args) {
		ConvertCase convertCase = new ConvertCase();
		String input = "A1ashVi6";
		convertCase.displayStringWithConvertedCase(input);
	}
}
