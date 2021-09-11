/*Test - 6 : 10th Sep'2021

Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
 
*/
package sayli_Vyavhare;

public class Test6_NonRepeatingWord {

	void getNonRepeatingWord(String input) {
		int index = 0;
		String minString = "";
		String[] str = input.split(" ");
		while (index < str.length) {
			int count = 0;
			minString = str[index];
			for (int innerindex = 0; innerindex < str.length; innerindex++) {
				if (str[innerindex].equals(minString))
					count++;
			}
			if (count == 1) {
				System.out.println("First non repeating word is " + minString + " with count -> " + count);
				break;
			}
			index++;
		}
	}
	
	char  getNonRepeatingCharacter(String str){
		char nonRChar=' ';
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				nonRChar= ch;
				break;
			}
			
		}
		return nonRChar;
	}

	public static void main(String[] args) {
		Test6_NonRepeatingWord test = new Test6_NonRepeatingWord();
		String input = "hi this is techno gm credits this hi is";
		test.getNonRepeatingWord(input);
		
		System.out.println("Non Repeating character is : " + test.getNonRepeatingCharacter("technocredits"));
	}

}
