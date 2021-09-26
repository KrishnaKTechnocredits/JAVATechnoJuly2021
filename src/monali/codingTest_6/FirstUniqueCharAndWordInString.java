package monali.codingTest_6;
/*Program 1: Find first non repeating character from a word. [expected : 10 mins]
input : technocredits
output : h 

Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno*/

public class FirstUniqueCharAndWordInString {

	void getFirstUniqueChar(String str) {

		for (int index = 0; index < str.length(); index++) {
			int count = 0;
			char ch = str.charAt(index);
			for (int index1 = 0; index1 < str.length(); index1++) {
				if (str.charAt(index1) == ch) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("First Unique Character in string : " + ch);
				break;
			}
		}
	}

	void getFirstUniqueWord(String str) {
		String[] output = str.split(" ");
		for (int index = 0; index < output.length; index++) {
			int count = 0;
			for (int index1 = 0; index1 < output.length; index1++) {
				if (output[index1].equals(output[index])) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("First Unique Character in string : " + output[index]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str1 = "technocredits";
		FirstUniqueCharAndWordInString uniquecharword = new FirstUniqueCharAndWordInString();
		uniquecharword.getFirstUniqueChar(str1);
		String input = "hi this is techno gm credits this hi is";
		uniquecharword.getFirstUniqueWord(input);
	}

}
