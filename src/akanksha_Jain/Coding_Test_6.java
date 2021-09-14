/* Test - 6 : 10th Sep'2021
Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is
output : techno
*/

package akanksha_Jain;

public class Coding_Test_6 {
	
	void findFirstNonRepeatCharacter(String str) {
		char output='\0';
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if(str.charAt(index) == ch && index == str.lastIndexOf(ch)) {
				output = ch;
				break;
			}
		}
		System.out.println("First non repeating character in " + str + " is " + output);
	}
	
	void findFirstNonRepeatWordInString(String str2) {
		String[] arr = str2.split(" ");
		for(int index=0; index<arr.length; index++) {
			if(str2.indexOf(arr[index])==str2.lastIndexOf(arr[index])) {
				System.out.println("First non repeating word in " + str2 + " is " + arr[index]);
				break;
			}
		}	
	}

	public static void main(String[] args) {
		String str = "technocredits";
		String str2 = "hi this is techno gm credits this hi is";
		Coding_Test_6 codingTest6 = new Coding_Test_6();
		codingTest6.findFirstNonRepeatCharacter(str);
		codingTest6.findFirstNonRepeatWordInString(str2);
	}
}
