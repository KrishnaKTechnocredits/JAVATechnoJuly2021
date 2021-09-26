package shweta_Dharmadhikari.string_assignment22;

public class CountOfDigitsFromString {

	int getTotalCount(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CountOfDigitsFromString countOfDigitsFromString = new CountOfDigitsFromString();
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("Total digits in a given string is : " + countOfDigitsFromString.getTotalCount(str));
	}

}
