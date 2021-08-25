package shantanu.characterClassAssignment22;

public class TotalDigitsInString {
	int getTotalDigitsInString(String str) {
		int count = 0;
		for(int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				count++;
		}
		return count;
	}
	void displayTotalDigitsInString(String str) {
		System.out.println("Total digits in the string are: "+getTotalDigitsInString(str));
	}
	public static void main(String[] args) {
		TotalDigitsInString totalDigitsInString = new TotalDigitsInString();
		String str = "Te1ch2no3cr4ed3it4s";
		totalDigitsInString.displayTotalDigitsInString(str);
	}
}