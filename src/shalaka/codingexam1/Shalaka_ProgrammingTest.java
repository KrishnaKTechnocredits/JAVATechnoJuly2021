/*Programming Test - 2 :

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/
package shalaka.codingexam1;

public class Shalaka_ProgrammingTest {
	
	void changeTheCaseOfChar(String input) {
		String str = "";
		System.out.print("Output is: ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				str = Character.toLowerCase(ch)+"" ;
			} else if (Character.isDigit(ch)) {
				str = Character.getNumericValue(ch)+"";

			} else if (Character.isLowerCase(ch)) {
				str = Character.toUpperCase(ch)+"";
			}
			System.out.print(str);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "A1ashVi6";
		Shalaka_ProgrammingTest shalaka_ProgrammingTest = new Shalaka_ProgrammingTest();
		shalaka_ProgrammingTest.changeTheCaseOfChar(str);
	}

}
