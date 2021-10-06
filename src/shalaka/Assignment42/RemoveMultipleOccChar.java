/* Assignment - 42 : 29th Sep'2021 
Program 1: Remove multiple occurrence of characters from given string.

input : "technocredits"
output : technordis*/


package shalaka.Assignment42;

public class RemoveMultipleOccChar {
	void removeMultipleOccChar(String str) {
		String output="";
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(str.indexOf(ch)==index) {
				output+=ch;
			}
		}
		System.out.println(
				"Removing multiple occurrence of characters from string: " + str + "\nOutput String is:" + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input= "technocredits";
RemoveMultipleOccChar removeMultipleOccChar = new RemoveMultipleOccChar();
removeMultipleOccChar.removeMultipleOccChar(input);
	}

}
