/*
Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family
*/
package santosh_Assignment37;

public class Assignment37 {
	void getLongestWord(String str) {
		String longestWord="";
		String[] word=str.split(" ");

		for(int index=0;index<word.length;index++) {
			for(int index1=1;index1<word.length;index1++) {
				if(word[index].length()>=word[index1].length())
					longestWord=word[index];
			}
		}
			System.out.println("\n Second longest word in given string is ::- " + longestWord);
    }
	public static void main(String[] args) {
		Assignment37 a37=new Assignment37();
		String input="Welcome to the family";
        a37.getLongestWord(input);
	}
}
