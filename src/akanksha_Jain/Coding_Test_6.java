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
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			int count =0;
			for(int index1=0; index1<str.length(); index1++) {
				if(str.charAt(index1) == ch && index == str.indexOf(ch))
					count ++;
			}
			if(count==1) {
				System.out.println("First non repeating character in " + str + " is " + str.charAt(index));
				break;
			}
		}
	}
	
	void findFirstNonRepeatWordInString(String str2) {
		int count=0;
		String[] arr = str2.split(" ");
		String firstNonRepeatWord = "", temp;
		for(int index=0; index<arr.length; index++) {
			count = 0;
			temp = arr[index];
			for(int index1=0; index1<arr.length; index1++) {
				if(temp.equals(arr[index1]))
					count++;
			}
			if(count==1) {
					firstNonRepeatWord = arr[index];
					break;
			}
		}
		System.out.println("First non repeating word in " + str2 + " is " + firstNonRepeatWord );
	}

	public static void main(String[] args) {
		String str = "technocredits";
		String str2 = "hi this is techno gm credits this hi is";
		Coding_Test_6 codingTest6 = new Coding_Test_6();
		codingTest6.findFirstNonRepeatCharacter(str);
		codingTest6.findFirstNonRepeatWordInString(str2);
	}
}
