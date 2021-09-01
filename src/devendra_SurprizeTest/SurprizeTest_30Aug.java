/*
Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6
*/

package devendra_SurprizeTest;

public class SurprizeTest_30Aug {
	void getUpperLowerDigitInString(String str_input) {
		String str_output = "";
		
		for(int index = 0; index < str_input.length(); index++) {
			if(Character.isUpperCase(str_input.charAt(index))) 
				str_output+=Character.toLowerCase(str_input.charAt(index));
			 else if(Character.isLowerCase(str_input.charAt(index))) 
				str_output+=Character.toUpperCase(str_input.charAt(index));
		 else 
			str_output+=str_input.charAt(index);
		}
		System.out.print(" After Rearranging, String = "+str_output);
	}
	
	public static void main(String[] args){
		SurprizeTest_30Aug test = new SurprizeTest_30Aug();
		String str_input = "A1ashVi6";
		System.out.print("Before Rearranging, String = "+str_input+"\n");
		test.getUpperLowerDigitInString(str_input);
	}
}
