package akanksha_K;

public class Assignment24 {
	
	int getcharCount(String input, char ch) {
		int count = 0;
		
		for (int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch) {
				count = count + 1;
			}
		}
		return count;
	}
	
	void getVowelsCount(String input) {
		char[] vowels = {'a','e','i','o','u'};
		for (int index=0; index<vowels.length; index++) {
			int vowelcount =  getcharCount(input, vowels[index]);
			System.out.println(vowels[index] + ":" + vowelcount);
		}	
	}
	
	void getMaxRepeatedWord(String input2) {
		int maxcount=0;
		String maxcountword = "";
		String[] words = input2.split(" ");
		for (int i=0;i<words.length;i++) {
			String curWord = words[i];
			int curWordFrequency = 0;
			for(int j=0;j<words.length;j++) {
				if(curWord == words[j]) {
					curWordFrequency++;
				}
			}
			if(curWordFrequency > maxcount) {
				maxcount = curWordFrequency;
				maxcountword = curWord;
			}
		}	
		System.out.println("Max repeated word is: " + maxcountword );
	}
	
	public static void main(String args[]) {
		String input = "technocredits";
		String input2 = "Hi Hello Hi Techno Hello Hi";
		
		Assignment24 assignment = new  Assignment24();
		
		assignment.getVowelsCount(input);	
		assignment.getMaxRepeatedWord(input2);
	}
}	
