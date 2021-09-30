package priti_String_programmes;

public class Assingment_41_2 {
	
	String getStringWithoutMultipleChar(String input) {
		System.out.println("String with multiple duplicate characters :"+input);
		String output= "";
		for(int index=0; index<input.length();index++){
			char ch = input.charAt(index);
			if (input.indexOf(ch)==input.lastIndexOf(ch)) {
				output += ch;	
			}
		}
		return output;
	}
	
	
	public static void main(String[] a) {
		Assingment_41_2 assingment_41_2 = new Assingment_41_2();
		String input= "technocredits";
		String output =assingment_41_2.getStringWithoutMultipleChar(input);
		System.out.println("String after removing duplicate characters :"+output);
	}

}
/*Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/