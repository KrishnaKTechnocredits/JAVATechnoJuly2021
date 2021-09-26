package shweta_Dharmadhikari.string_programming_test2;

/*
 * Programming Test - 2 :

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6
 */
public class ConvertingLowerToUpperAndUpperToLowerCase {

	String output = "";

	String changeCharacterCase(String str) {
		char ch[] = str.toCharArray();
		for (int index = 0; index < ch.length; index++) {
			if (Character.isUpperCase(ch[index])) {
				ch[index] = Character.toLowerCase(ch[index]);
				output += ch[index];
			} else if (Character.isLowerCase(ch[index])) {
				ch[index] = Character.toUpperCase(ch[index]);
				output += ch[index];
			} else
				output += ch[index];
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "A1ashVi6";
		ConvertingLowerToUpperAndUpperToLowerCase convertingLowerToUpperAndUpperToLowerCase = new ConvertingLowerToUpperAndUpperToLowerCase();
		System.out.println("Output : " + convertingLowerToUpperAndUpperToLowerCase.changeCharacterCase(str));
	}

}
