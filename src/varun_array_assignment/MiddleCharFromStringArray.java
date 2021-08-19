package varun_array_assignment;

public class MiddleCharFromStringArray {
	char[] middlecharacter(String[] input) {
		char[] ch = new char[3];
		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			if (str.length() % 2 == 0)
				ch[index] = str.charAt(str.length() / 2-1);
			else
				ch[index] = str.charAt(str.length() / 2 );
		}
		return ch;
	}

	public static void main(String[] args) {
		MiddleCharFromStringArray assignment15_1 = new MiddleCharFromStringArray();
		String[] str = { "hello", "Varunj", "Cybage" };
		char[] middleCharFromGivenString = assignment15_1.middlecharacter(str);
		for (int index = 0; index < str.length; index++) {
			System.out.println("the middle character of " + str[index] + " is " + middleCharFromGivenString[index]);
	}
}
}
