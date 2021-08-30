package paresh.assignment20;

/*program 2: Find frequency of each character from user defined string.
input : word -> hello
output : h -> 1
         e -> 1
         l -> 2
         o -> 1*/

public class FreqOfChar {
	int getCharCount(String input, char ch) {
		int count=0;
		
		for(int index=0; index < input.length();index++) {
			if(input.charAt(index) == ch) {
			count++;
			}
		}
		System.out.println(ch+":"+count);
		return count;
	}
	
	void printFreqOfEachChar(String input) {
				 
		for(int index=0; index <input.length();index++) {
			if(index == input.indexOf(input.charAt(index)))
				getCharCount(input, input.charAt(index));
		}	
	}
	public static void main(String[] args) {
		FreqOfChar freqOfChar = new FreqOfChar();
		freqOfChar.printFreqOfEachChar("hello");
	}
}