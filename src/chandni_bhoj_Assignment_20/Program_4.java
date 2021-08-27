package chandni_bhoj_Assignment_20;

public class Program_4 {

	int getFrequencyOfCharacters (String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}
	
	void getDuplicateCharFrequency (String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == index) {
				getFrequencyOfCharacters(input, input.charAt(index));
				System.out.println ("Frequency of " + input.charAt(index) + " is " + getFrequencyOfCharacters(input,input.charAt(index)));
		}
		}
		
	}
	
	public static void main(String[] args) {
		new Program_4().getDuplicateCharFrequency("aakanksha");
	}
}
