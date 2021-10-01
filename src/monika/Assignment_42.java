/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis
Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/
package monika;

public class Assignment_42 {
	void removeMultipleOccuranceFromString(String input) {
		String output="";
		for(int index=0;index<input.length();index++) {
			if(input.indexOf(input.charAt(index))==index)
				output+=input.charAt(index);
			
		}
		System.out.println("Remove multiple occurrence of characters from given '" + input + "' String is: " + output);
		
	}
	void removeAllOccuranceOfDuplicateCharFromString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				output += input.charAt(index);
		}
		System.out.println("Remove all occurrence of characters from given '" + input + "' String is: " + output);
	
	}
	
	public static void main(String[] args) {
		Assignment_42 assignment_42=new Assignment_42();
		assignment_42.removeMultipleOccuranceFromString("tecchnocredits");
		assignment_42.removeAllOccuranceOfDuplicateCharFromString("technocredits");
	}

}
