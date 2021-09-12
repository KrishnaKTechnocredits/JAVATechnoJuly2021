/*Test - 6 :
Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno*/
package sagar_Anasane;

public class CodingTest6 {
	void findFirstNonRepeatingCharacterFromGivenString(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch)==str.lastIndexOf(ch)) {
				System.out.println("Non Repeatative Character from Given String : "+ch);
				break;
			}
		}
	}
	
	void findNonRepatingWordFromGivenString(String str) {
		String[] string=new String[str.length()];
		string=str.split(" ");

		for(int index1=0;index1<string.length;index1++) {
			if(str.indexOf(string[index1])==str.lastIndexOf(string[index1])) {
				System.out.println("\n"+"Non Repeatative Word from given String : "+string[index1]);
				break;
			}	
		}
	}
	public static void main(String args[]) {
		String input1 = "technocredits";
		String input2 = "hi this is techno gm credits this hi is";
		CodingTest6 codingTest6 =new CodingTest6();
		codingTest6.findFirstNonRepeatingCharacterFromGivenString(input1);
		codingTest6.findNonRepatingWordFromGivenString(input2);
	}
}
