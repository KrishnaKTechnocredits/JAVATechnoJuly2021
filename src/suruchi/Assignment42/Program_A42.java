package suruchi.Assignment42;

public class Program_A42 {

	void removeMultipleOccurence(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == index)
				output += str.charAt(index);
		}
		System.out.println("String after removing multiple occurences of a letter is: " + output);
	}

	void removeDuplicates(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				output += ch;
		}
		System.out.println("String after removing duplicates of a letter is: " + output);

	}

	public static void main(String[] args) {
		Program_A42 program_A42 = new Program_A42();

		String str = "technocredits";
		System.out.println("String is: " + str);

		System.out.println();
		program_A42.removeMultipleOccurence(str);

		System.out.println();
		program_A42.removeDuplicates(str);
	}
}