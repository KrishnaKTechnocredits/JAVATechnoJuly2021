/* program 1: Find how many words in a given statement.
input = "Hi Techno Credits Hello"
output : 4  */


package arti_K.Assignment_19;

public class FindWords {
	
	int findWordsFromstring(String input) {
		int count = 0;
		String[] str = input.split(" ");
	//	count = str.length;
		for(int index = 0; index < str.length; index++) {
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String input = "Hi Techno Credits Hello";
		
		FindWords findwords = new FindWords();
		int wordCount = findwords.findWordsFromstring(input);
		System.out.println("Word count in given String is : "+wordCount);
	}

}
