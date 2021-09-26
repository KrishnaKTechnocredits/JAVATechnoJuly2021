package amol_Pawar.assignment_24;

public class Program_1 {
	void getVowelCount(String input) {
		System.out.print("Vowels in given String " + input + " are : ");
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			if (input.indexOf(ch) == index) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					System.out.print(ch + ", ");
				}
			}
		}
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		program_1.getVowelCount("technocredits");

	}
}
