package shantanu.rearrangeCharactersInString_additionOfNumbersInString_assignment25;

public class RearrangeCharactersInString {
	String getRearrangedString(String input) {
		String upperStr = "";
		String lowerStr = "";
		String digitStr = "";
		for(int index = 0; index < input.length(); index++) {
			if(Character.isUpperCase(input.charAt(index)))
				upperStr += input.charAt(index);
			else if(Character.isDigit(input.charAt(index)))
				digitStr += input.charAt(index);
			else if(Character.isLowerCase(input.charAt(index)))
				lowerStr += input.charAt(index);
		}
		return upperStr + digitStr + lowerStr;
	}
	void displayRearrangedString(String input) {
		System.out.println("New string: "+getRearrangedString(input));
	}
	public static void main(String[] args) {
		RearrangeCharactersInString rearrangeCharactersInString = new RearrangeCharactersInString();
		String input = "Ma1U2liK";
		rearrangeCharactersInString.displayRearrangedString(input);
	}
}
