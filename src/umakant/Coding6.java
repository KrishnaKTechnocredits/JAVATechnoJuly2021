/*
 Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
 */
package umakant;

public class Coding6 {

	char getFirstNonRepeatingCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			boolean flag = true;
			if (input.indexOf(input.charAt(index)) == index) {
				for (int innerIndex = index + 1; innerIndex < input.length(); innerIndex++) {
					if (input.charAt(innerIndex) == input.charAt(index)) {
						flag = false;
						break;
					}
				}
				if (flag)
					return input.charAt(index);
			}
		}
		return ' ';
	}

	String getFirstNonRepeatingWord(String input) {
		String[] words = input.split(" ");
		for (int index = 0; index < words.length; index++) {
			boolean flag =true;
			for (int innerIndex = 0; innerIndex < words.length; innerIndex++) {
				if (innerIndex != index) {
					if(words[index].equals(words[innerIndex])) {
						flag =false;
						break;
					}
				}
			}
			if(flag)
				return words[index];
		}
		return "";
	}

	public static void main(String[] args) {
		Coding6 coding6= new Coding6();
		System.out.println(coding6.getFirstNonRepeatingCharacter("technocredtis"));
		System.out.println(coding6.getFirstNonRepeatingWord("hi this is techno gm credits this hi is"));
	}

}
