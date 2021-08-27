package anurag;

public class FindDigit {

	int getDigit(String str) {
		boolean isDigit = true;
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);

			if (isDigit == Character.isDigit(ch)) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		FindDigit digit = new FindDigit();
		String str = "Te11ch2no3cr4edi2ts";
		System.out.println("Total digit-" + digit.getDigit(str));

	}
}
