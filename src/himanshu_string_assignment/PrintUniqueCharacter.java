package himanshu_string_assignment;

public class PrintUniqueCharacter {

	void unqiueChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println("Unqiue Characters are : " + ch);
	}

	void finalUnique(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				unqiueChar(input, input.charAt(index));

		}

	}

	public static void main(String[] args) {

		PrintUniqueCharacter program3 = new PrintUniqueCharacter();
		program3.finalUnique("aakanksha");
	}

}