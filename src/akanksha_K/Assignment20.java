package akanksha_K;
import java.util.Scanner;

public class Assignment20 {
	
	static int frequency(String word, char ch ) {
		int count = 0;
		for (int i=0; i<word.length(); i++) {
			if(ch == word.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	static void frequencyOfEachChar(String word) {
		for (int i=0; i<word.length(); i++) {
			if(i == word.indexOf(word.charAt(i))) {
				char cur_char = word.charAt(i);
				int char_frequency = frequency(word, cur_char);
				System.out.println("Character " + cur_char + " occurs "+ char_frequency + " times");
		    }
		}	
	}
	
	static void getUniqueChar(String word) {
		for (int i=0; i<word.length(); i++) {
			if(i == word.indexOf(word.charAt(i))) {
				char current_char = word.charAt(i);
				int char_frequency = frequency(word, current_char);
				if(char_frequency == 1)
				System.out.println("Unique Character: " +  current_char );
		    }
		}	
	}
	
	static void getDuplicateChar(String word) {
		for (int i=0; i<word.length(); i++) {
			if(i == word.indexOf(word.charAt(i))) {
				char current_char = word.charAt(i);
				int char_frequency = frequency(word, current_char);
				if(char_frequency > 1)
				System.out.println("Duplicate Character: " +  current_char );
		    }
		}	
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String temp = scanner.next();
		System.out.println("Enter character: ");
		char ch = scanner.next().charAt(0);
		System.out.println("The frequency of " + ch + " is:  " + frequency(temp,ch));
		frequencyOfEachChar("hello");
		getUniqueChar("akanksha");
		getDuplicateChar("akanksha");
		scanner.close();
	}
}
