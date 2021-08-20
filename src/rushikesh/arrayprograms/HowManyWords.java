package rushikesh.arrayprograms;

public class HowManyWords {
	int count=0;
	int giveWordCount(String input) {
		String[] arr=input.split(" ");
		count=arr.length;
	return count;	
	}
	
	public static void main(String[] args) {
		HowManyWords howManyWords=new HowManyWords();
		String input = "Hi Techno Credits Hello";
		int count=howManyWords.giveWordCount(input);
		System.out.println(count);
	}
}
