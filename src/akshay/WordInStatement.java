/*program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4*/

package akshay;

public class WordInStatement {
	
	int getNumberofWord(String input) {
		String[] arr = input.split(" ");
		return arr.length;
	}
	
	public static void main(String[] args) {
		WordInStatement words = new WordInStatement();
		String input = "Hi Techno Credits Hello";
		System.out.println("Number of words in given Statement is: " +words.getNumberofWord(input));
		
	}
}
