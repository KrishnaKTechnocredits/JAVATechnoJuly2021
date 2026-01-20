package avinash.assignment36;

/*WAP to swap vowel in String mean last first vowel should replace
first vowel in String and vice verse.
input : "good morning" output: "giod mornong”
input : "amol" output: "omal"
input : "haorseuih" output: "hiurseoah" 
 */
public class Assignment_36 {
	String getVowels(String input) {
		char ch;
		String vowels = "", vowelsRev = "";
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels += ch;
		}
		for(int index=vowels.length()-1; index>=0; index--) {
			vowelsRev += vowels.charAt(index);
		}
		return vowelsRev;
	}
	String swapVowel(String input) {
		char ch;
		String output = "", vowels = getVowels(input);
		int vowelsIndex = 0;
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output += vowels.charAt(vowelsIndex);
				vowelsIndex++;
			}
			else
				output += ch;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_36 assignment_36 = new Assignment_36();
		String str1 = "good morning";
		String str2 = "amol";
		String str3 = "haorseuih";
		System.out.println("input: " + str1 + " & output: " + assignment_36.swapVowel(str1));
		System.out.println("input: " + str2 + " & output: " + assignment_36.swapVowel(str2));
		System.out.println("input: " + str3 + " & output: " + assignment_36.swapVowel(str3));

	}

}
