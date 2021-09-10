package amol_Pawar.ProgrammingTest_6;

public class Program_1 {

	void getNonRepeatingChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println("First non repeating Character is : " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		String str = "technocredits";
		program_1.getNonRepeatingChar(str);

	}

}
