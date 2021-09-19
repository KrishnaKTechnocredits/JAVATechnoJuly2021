package gauravk.Test_6;
/*
 * Test - 6 : 10th Sep'2021
Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h							[time taken: 9 minutes]
Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is
output : techno

 */
public class FindNonRepeatingCharacterInWord {
	
	void findFirstNonRepeatingCharacter(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				System.out.println("The first non repeating character of word ["+str+"] is "+str.charAt(i));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		new FindNonRepeatingCharacterInWord().findFirstNonRepeatingCharacter(input);
	}
}
