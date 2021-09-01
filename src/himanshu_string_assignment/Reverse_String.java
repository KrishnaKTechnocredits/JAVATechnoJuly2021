package himanshu_string_assignment;

public class Reverse_String {

	void reverseString(String input) {

		System.out.println(input);

		String reverse = "";

		for (int index = input.length() - 1; index >= 0; index--) {
			reverse = reverse + input.charAt(index);
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {

		String input = "This is technocredits";

		Reverse_String rs = new Reverse_String();
		rs.reverseString(input);

	}

}
