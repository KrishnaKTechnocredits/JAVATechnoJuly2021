package suchita;

// Assignment 36

//WAP to swap vowel in string (last vowel should replace first vowel in string)

class Assignment36 {

	void swapVowels(String input) {
	
		String output = "";
		int count = 0;
		int j = input.length()-1;
		char ch1,ch2;
		char[] str = input.toCharArray();
		System.out.println(" \nInput string :: " + input);
		
		for (int i = 0; i < input.length() / 2; i++) {
			 ch1 = input.charAt(i);
			while (j >= i + 1) {
				 ch2 = input.charAt(j);
				if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') && (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')) {
					str[i] = ch2;
					str[j] = ch1;
					count++;
					j--;
					break;
				}
				j--;
			}
			if (count == 0) {
				j = input.length() - 1;
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			output += str[i];
		}
		
		System.out.println(" Output string :: " + output);
	}
	
	public static void main(String[] args) {
		
		Assignment36 assignment = new Assignment36();
		String input1 = "good morning";
		String input2 = "amol";
		String input3 = "haorseuih";
		assignment.swapVowels(input1);
		assignment.swapVowels(input2);
		assignment.swapVowels(input3);
		
	}
}