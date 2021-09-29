/* Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis */

package akanksha_Jain.Assignment_42;

public class Program_1 {
	
	
	void removeMultipleOccurence(String str) {
		String str1 = "";
		System.out.println("After removing multiple characters from string '" + str + "' -");
		System.out.print("Output is- ");
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)!=str.lastIndexOf(ch)) {
				if(!str1.contains(Character.toString(ch))) {
					str1 += ch;
				}
			}
			else
				str1 += ch;
		}
		System.out.println(str1);
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		Program_1 program_1 = new Program_1();
		program_1.removeMultipleOccurence(input);
	}
}