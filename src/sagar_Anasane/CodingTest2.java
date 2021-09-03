/*Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI*/
package sagar_Anasane;

public class CodingTest2 {
	void lowerToUpperandUpperToLower(String inp) {
		for(int index=0;index<inp.length();index++) {
			char ch = inp.charAt(index);
			if(Character.isUpperCase(ch))
				System.out.print(Character.toLowerCase(ch));
			else
				System.out.print(Character.toUpperCase(ch));
					}
		}
	
	public static void main(String[] args) {
		String input = "A1ashVi6";
		CodingTest2 codingTest2 = new CodingTest2();
		codingTest2.lowerToUpperandUpperToLower(input);
	}
}
