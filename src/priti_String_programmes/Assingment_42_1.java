package priti_String_programmes;


public class Assingment_42_1 {
	String getStringWithoutMulOccuranceChar(String input) {
		System.out.println("String with multiple occurance of characters : " + input);
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)){
				output += ch;
			}	
		}
		return output;
	}
	
	public static void main(String[] a) {
		Assingment_42_1 assingment_42_1 = new Assingment_42_1();
		String input= "technocredits";
		String output = assingment_42_1.getStringWithoutMulOccuranceChar(input);
		System.out.println("String after removing multiple occurance of characters : "+output);
	}
}
/*Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"git 
output : technordis
*/

