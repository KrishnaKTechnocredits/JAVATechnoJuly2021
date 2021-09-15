package mratunjay.Programming_Test2;

public class Test_2 {

	void getLowerToUpperOrUpperToLowerOfGivenString(String str) {

		String output = "";
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);

			if (Character.isUpperCase(ch))

				output += Character.toString(Character.toLowerCase(ch));

			else if (Character.isLowerCase(ch))

				output += Character.toString(Character.toUpperCase(ch));

			else

				output += Character.toString(ch);
		}

		System.out.println("Output String : " + output);

	}

	public static void main(String[] args) {

		String input = "A1ashVi6";
		Test_2 T2 = new Test_2();
		T2.getLowerToUpperOrUpperToLowerOfGivenString(input);

	}
}
