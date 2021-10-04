package gauravk.Assignment_42;
/*
 * Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis
 */
public class RemoveRepeatingCharacterOfExistingInString {
	
	String removeRepeatingChar(String str) {
		String s = "";
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==(str.lastIndexOf(str.charAt(i)))) {
				s += Character.toString(str.charAt(i));
			}
			else {
				s += Character.toString(str.charAt(i));
				str = str.replace(str.charAt(str.lastIndexOf(str.charAt(i))),'0');
			}
		}
		s = s.replaceAll("0", "");
		return s;
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		System.out.println("Remove multiple occurrence of characters from given string. ["+input+"] is \n"+new RemoveRepeatingCharacterOfExistingInString().removeRepeatingChar(input));
	}
}
