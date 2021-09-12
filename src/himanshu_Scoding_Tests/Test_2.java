package himanshu_Scoding_Tests;

public class Test_2 {

	void allLowerToUpperMtd(String input) {

		System.out.println("INPUT : " + input);

		String output = "";

		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);

			if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			} else
				output = output + ch;
		}
		System.out.println("OUTPUT : " + output);
	}

	public static void main(String[] args) {

		String input = "A1ashVi6";

		Test_2 test_2 = new Test_2();
		test_2.allLowerToUpperMtd(input);
	}

}
