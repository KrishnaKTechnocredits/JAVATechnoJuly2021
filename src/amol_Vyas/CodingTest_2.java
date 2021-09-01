/*Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6*/

package amol_Vyas;

public class CodingTest_2 {

	void getConvertUpperToLowerAndLowerToUpper(String input) {
		String output="";
		for(int index=0;index<input.length();index++) {
			if(Character.isUpperCase(input.charAt(index))) 
				output+=Character.toLowerCase(input.charAt(index));
			 else if(Character.isLowerCase(input.charAt(index))) 
				output+=Character.toUpperCase(input.charAt(index));
		 else 
			output+=input.charAt(index);
		}
	System.out.println("Output is "+output);
	}

	public static void main(String[] args) {
		String input="A1ashVi6";
		CodingTest_2 codingTest_2 = new CodingTest_2();
		codingTest_2.getConvertUpperToLowerAndLowerToUpper(input);
	}
}