package riten;
class WordsInStatement{
	int cnt=0;
	int countWords(String input){
		
		String word[]=input.split(" ");
		cnt=word.length;
		//System.out.println("Words in statements are: "+cnt);
	return cnt;
	}
	

	public static void main(String[] args){
		WordsInStatement wordCount=new WordsInStatement();
		wordCount.countWords("Hi Techno Credits Hello");
		System.out.println("Words in statements are: "+wordCount.cnt);
		
	}
}