package arti_G_CodingTest6;
/*Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno*/
public class FindNonRepeatingNumber {

	void nonRepeatingNum(String str) {
	char ch=0;
	for(int index=0;index<str.length();index++) {
		if(str.lastIndexOf(str.charAt(index))==index) {
			ch=str.charAt(index);
			break;
		}
	}
	System.out.println("First non repeating char in str is "+ ch);
	}
	public static void main(String[] args) {
		FindNonRepeatingNumber findNonRepeatingNumber = new FindNonRepeatingNumber();
		String str = "technocredits";
		findNonRepeatingNumber.nonRepeatingNum(str);
		
		String str1 = "hi this is techno gm credits this hi is";
		findNonRepeatingNumber.nonRepeatingNum(str1);
	}

}
