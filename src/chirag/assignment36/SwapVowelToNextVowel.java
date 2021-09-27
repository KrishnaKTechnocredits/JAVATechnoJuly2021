package chirag.assignment36;

/*WAP to swap vowel in String mean last first vowel should replace
first vowel in String and vice verse.
input : "good morning" output: "giod mornong”
input : "amol" output: "omal"
input : "haorseuih" output: "hiurseoah" 
 */

public class SwapVowelToNextVowel {
	
	String swapVowels(String str1) {
		String vowels = "";
		String vowelsReverse ="";
		char ch;
		for(int i=0;i < str1.length();i++) {
			 ch=str1.charAt(i);
			if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
				vowels=vowels+ch;
			}
		}
		for(int i = vowels.length()-1;i >=0;i--) {
			vowelsReverse=vowelsReverse + vowels.charAt(i);
		}
		return vowelsReverse;
	}
	String SwapVowelsPosition(String str1) {
		char ch;
		String output="";
		String vowels=swapVowels(str1);
		int vowelsIndex=0;
		for(int i=0;i < str1.length();i++) {
			ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output=output + vowels.charAt(vowelsIndex);
				vowelsIndex++;
			}
			else {
				output=output + ch; 
			}
		}
		return output;	
	}
	public static void main(String[] args) {
		SwapVowelToNextVowel swapVowelToNextVowel=new SwapVowelToNextVowel();
		String str1="hello there";
		System.out.println("Input : "+str1+"\nOutput : "+swapVowelToNextVowel.SwapVowelsPosition(str1));
		System.out.println("--------------------");
		str1="amol";
		System.out.println("Input : "+str1+"\nOutput : "+swapVowelToNextVowel.SwapVowelsPosition(str1));
		System.out.println("--------------------");
		str1="haorseuih";
		System.out.println("Input : "+str1+"\nOutput : "+swapVowelToNextVowel.SwapVowelsPosition(str1));
	}
}