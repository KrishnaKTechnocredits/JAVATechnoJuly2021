/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/

package bhakti;

public class Assignment_42 {
	/*/Program 1: Remove multiple occurrence of characters from given string.
		input : "technocredits"
		output : technordis*/
	
	void removeMultipleOccurance(String input) {
		String output="";
		 
		for (int i=0; i<input.length(); i++ ) {
			char ch = input.charAt(i);
			if(input.indexOf(ch)==i) {  
					output+=ch;
			}	
		}
		System.out.println(output);
	}
	
	/*//Program 2: Remove all occurrence of duplicate character from given string.
	input : "technocredits"
		output : "hnordis"*/
	
	void removeAllDuplicateoccurrence(String input) {
		String output="";
		for (int i=0; i < input.length();i++) {
			char ch= input.charAt(i);
			if (input.indexOf(ch)==input.lastIndexOf(ch))
				output+=ch;
		}
		System.out.println(output);
		
	}
		
	public static void main(String[] args) {
		Assignment_42 a= new Assignment_42();
		a.removeMultipleOccurance("technocredits");
		a.removeAllDuplicateoccurrence("technocredits");
	}
}
