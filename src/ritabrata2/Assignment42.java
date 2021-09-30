/*Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/



package ritabrata2;

public class Assignment42 {
	void removeMultiple(String input) {
		String output="";
		for (int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(input.indexOf(ch)==index) {
				output+=ch;
			}
			
		}
		System.out.println("The output for the input "+input+", after removing multiple occurance is: "+output);
	}
	
	void removeDuplicate(String input) {
		String output="";
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				output+=ch;
			}
		}
		System.out.println("The output for the input "+input+", after removing duplicatye occurance is: "+output);
	}

	public static void main(String[] args) {
		Assignment42 removeRepeat = new Assignment42();
		removeRepeat.removeMultiple("technocredits");
		removeRepeat.removeDuplicate("technocredits");

	}

}
