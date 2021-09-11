/*
 Programming Test - 2 : 30th Aug 2021
Convert all lowercase to uppercase and uppercase to lowercase in a given string.
Input : A1ashVi6
Output : a1ASHvI6
 */
package atul_K.Assignments.ProgramTest2;

public class ProgramTest2 {
	String convertCaseOfCharacterInString(String str) {
		String out = "";
		for (int index =0; index < str.length();index++) {
			if (Character.isUpperCase(str.charAt(index)))
				out += Character.toLowerCase(str.charAt(index));
			else
				out += Character.toUpperCase(str.charAt(index));
		}
		return out;
	}
	
	public static void main(String[] args) {
		String str ="A1ashVi6";
		ProgramTest2 pt2 = new ProgramTest2();
		System.out.println(pt2.convertCaseOfCharacterInString(str));
	}
}
// time taken to wap is 10 min
