package akanksha_K;

public class Assignment19 {
	
	static String[] findWords(String str) {
		return str.split(" ");
	}
	
	static String getmaxsizeword(String str) {
		String words[] = findWords(str);
		int max_length = 0;
		String max_length_word = null;
		for (int index=0; index<words.length; index++) {
			String word = words[index];
			if (word.length() > max_length) {
				max_length = word.length();
				max_length_word =  word;
			}
		}
		return max_length_word;
	}
	
	static String getminsizeword(String str) {
		String words[] = findWords(str);
		int  min_length = str.length();
		String min_length_word = null;
		for (int index=0; index<words.length; index++) {
			String word = words[index];
			if (word.length() < min_length) {
				min_length = word.length();
				min_length_word =  word;
			}
		}
		return min_length_word;
	}
	
	static int sum(String str) {
		String words[] = findWords(str);
		int sum = 0;
		for (int index=0; index<words.length; index++) {
			String word = words[index];
			int val = Integer.parseInt(word);
			sum = sum + val;
		}
		return sum;
	} 
		
	public static void main(String[] args) {
		String str = "Hi Hello How Are You GM";
		String[] words = findWords(str);
		System.out.println(words.length);
		
		String str2  = "good morning technocredits hi hello";
		System.out.println(getmaxsizeword(str2));
		System.out.println(getminsizeword(str2));
		
		String str3= "10 10 20 30";
		System.out.println(sum(str3));
	}
}
