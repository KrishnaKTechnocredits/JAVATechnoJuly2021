package kalpesh;

public class Assignment_22_Program_1 {
	static int count = 0;

	int getDigitsFromString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "Te1ch2no3cr4ed3it4s";
		int answer = new Assignment_22_Program_1().getDigitsFromString(str);
		System.out.println("The number of digits in a string is " + answer);
	}
}

/*
 * Program 1 : Find total digits in a given string. String str =
 * "Te1ch2no3cr4ed3it4s" output : 6
 */
