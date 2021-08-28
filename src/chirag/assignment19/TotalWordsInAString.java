package chirag.assignment19;

public class TotalWordsInAString {
	int count;
	
	int countWords(String input) {
		
		for(int index=0; index < input.length();index++) {
			char ch = input.charAt(index);
			if(ch == ' ') {
				count ++;
			}	
		}
		return count +1;
	}
	public static void main(String[] args) {
		TotalWordsInAString totalWordsInAString = new TotalWordsInAString();
		String str = "Hi Hello Techno Credits";
		System.out.println("Total words in a String : "+totalWordsInAString.countWords(str)+" words");
	}
}