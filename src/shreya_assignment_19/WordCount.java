package shreya_assignment_19;

public class WordCount {
	int getWordCount(String input) {
		String[] arr= input.split(" ");
		return arr.length;
		
	}
	public static void main(String[] args) {
		WordCount wordCount=new WordCount();
		String str = "Hi Techno Credits Hello";
		System.out.println("Number of words in the statement "+"\""+ str+"\""+" are "+wordCount.getWordCount(str));
	}
}