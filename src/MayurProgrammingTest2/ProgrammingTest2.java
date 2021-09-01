/*
 Convert all lowercase to uppercase and uppercase to lowercase in a given string.
Input : A1ashVi6
Output : a1ASHvI6
 
 */
package MayurProgrammingTest2;

public class ProgrammingTest2 {
	
	String convertLowerToUpperCase(String input) {
		String output ="";
		for (int index = 0; index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				output = output + ch;
			}
			if(Character.isUpperCase(input.charAt(index))) {
				char uCase = Character.toLowerCase(ch);
				output = output + uCase;
			}
			if(Character.isLowerCase(input.charAt(index))) {
				char lCase = Character.toUpperCase(ch);
				output = output + lCase;
			}
		}
		
		return output;
	}
	

	public static void main(String[] args) {
		ProgrammingTest2 pt2 = new ProgrammingTest2();
		String input ="A1ashVi6";
		System.out.println(pt2.convertLowerToUpperCase(input));
		

	}

}
