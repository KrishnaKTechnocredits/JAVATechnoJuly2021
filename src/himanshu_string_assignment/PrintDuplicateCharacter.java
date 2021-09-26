package himanshu_string_assignment;

public class PrintDuplicateCharacter {

	void duplicateChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " " + count);
	}

	void duplicateMtd(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index))) {
				duplicateChar(input, input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		PrintDuplicateCharacter program4 = new PrintDuplicateCharacter();
		program4.duplicateMtd("himanshu");
	}

}
