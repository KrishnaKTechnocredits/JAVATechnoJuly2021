package swati.Assignment42;

/*
 * Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"

Day - 48 : 29th Sep'2021

 */

public class Assignment42 {

	void removeMultipleOccurrence(String input) {
		String output="";
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)!=' ') {
		  output=output+input.charAt(index);
		  input=input.replace(input.charAt(index),' ');
			}
		}
		System.out.println(output);
	}
	
	void removeAllDuplicateOccurrence(String input) {
		String output="";
		for(int index=0;index<input.length();index++) {
			if(input.indexOf(input.charAt(index))==input.lastIndexOf(input.charAt(index))){
				output=output+input.charAt(index);
			}	
		}
		System.out.println(output);
	}
	
	public static void main(String[] a) {
		Assignment42 a1=new Assignment42();
		a1.removeMultipleOccurrence("technocredits");
		a1.removeAllDuplicateOccurrence("technocredits");
		
	}
}

