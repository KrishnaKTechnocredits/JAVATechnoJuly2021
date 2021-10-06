/*WAP to find length of String without using Length Method and length property.
String input="technocredits";
output=13;*/
package shalaka.Assignment43;

public class WordLength {
	int getWordLength(String str) {
		int count = 0;
		while (true) {
			try {
				char ch = str.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException se) {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		WordLength wordLength = new WordLength();
		System.out.println("Length of " + input + " is: " + wordLength.getWordLength(input));
	}

}
