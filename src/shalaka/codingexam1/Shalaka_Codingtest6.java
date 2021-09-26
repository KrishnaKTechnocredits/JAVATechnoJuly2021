/*Test - 6 : 10th Sep'2021

Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno*/
package shalaka.codingexam1;

public class Shalaka_Codingtest6 {
	char getFirstNonRepChar(String input) {
		char nonRepChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				nonRepChar = ch;
				break;
				}
			//System.out.println(input.charAt(index));
		}
		
		return nonRepChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		Shalaka_Codingtest6 shalaka_Codingtest6 = new Shalaka_Codingtest6();
		char nonRepCha=shalaka_Codingtest6.getFirstNonRepChar(input);
		System.out.println(" First non repeating character from a word is " + nonRepCha);
	}
}
