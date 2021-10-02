/* Assignment - 42 : 29th Sep'2021 
Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis */

package akanksha_Jain.Assignment_42;

public class Program_2 {
	
	void removeDuplicateOccurence(String str) {
		System.out.println("After removing duplicate characters from string '" + str + "'");
		System.out.print("Output is- ");
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		Program_2 program_2 = new Program_2();
		program_2.removeDuplicateOccurence(input);
	}

}