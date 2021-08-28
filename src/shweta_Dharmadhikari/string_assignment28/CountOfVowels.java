package shweta_Dharmadhikari.string_assignment28;
/*
 Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i
 */
public class CountOfVowels {
	int count=0;
	
	void getVowels(String input) {
		String vowel="";
		for (int index = 0; index<input.length();index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)) {
				switch(ch)
				{
				case 'a':
				case 'A':
					vowel = vowel +"a";
					count++;
					break;
				case 'e':
				case 'E':
					vowel = vowel +"e";
					count++;
					break;
				case 'i':
				case 'I':
					vowel = vowel +"i";
					count++;
					break;
				case 'o':
				case 'O':
					vowel = vowel +"o";
					count++;
					break;
				case 'u':
				case 'U':
					vowel = vowel +"o";
					count++;
					break;	
				}
			}
		} 
		System.out.println("Count of Vowels -> "+count+ "\nVowels are : "+vowel);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfVowels countOfVowels = new CountOfVowels();
		countOfVowels.getVowels("technocredits");
	}

}
