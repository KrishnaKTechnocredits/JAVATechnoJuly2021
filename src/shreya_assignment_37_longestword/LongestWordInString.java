/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/
package shreya_assignment_37_longestword;

public class LongestWordInString {
	void getLongestWord(String str) {
		String longestWord="";
		String[] word=str.split(" ");
		
		for(int index=0;index<word.length;index++) {
			for(int index1=1;index1<word.length;index1++) {
				if(word[index].length()>=word[index1].length())
					longestWord=word[index];
			}
		}
		System.out.println("Second largest word from the string is: "+longestWord);
	}
	public static void main(String[] args) {
		LongestWordInString longestWordInString=new LongestWordInString();
		String input="Welcome to the family";
		longestWordInString.getLongestWord(input);
	}

}
