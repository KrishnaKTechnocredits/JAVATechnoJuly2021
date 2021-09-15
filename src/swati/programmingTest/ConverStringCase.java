/*
 * Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6
 */
package swati.programmingTest;

public class ConverStringCase {
	
	void convertStr(String input) {
		String tempLower="";
		String tempUpper="";
		String output="";
		for(int index=0;index<input.length();index++) {
			if (Character.isDigit(input.charAt(index))) {
				 output=output+input.charAt(index);
			 }
			else if(Character.isLowerCase((input.charAt(index)))) {
				 
				 tempLower=input.charAt(index)+"";
				 output=output+tempLower.toUpperCase();
			 }
			 else if(Character.isUpperCase((input.charAt(index)))) {
				 tempUpper=input.charAt(index)+"";
				 output=output+tempUpper.toLowerCase();
			 }
			 
	
	}
		System.out.println("Output:"+output);

  }
	
	public static void main(String[] a) {
		ConverStringCase convertCase =new ConverStringCase();
		convertCase.convertStr("A1ashVi6");
	}
}

