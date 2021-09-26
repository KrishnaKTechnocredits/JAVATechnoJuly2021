/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"
*/
package ritabrata2;

public class Assignment_36 {
	boolean findVowel(char ch) {
		if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			return true;
		else
			return false;
	}
	
	String getReverseVowel(String str) {
		String rev="";
		for(int i=str.length()-1; i>=0;i--) {
			if(findVowel(str.charAt(i)))
				rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	void getSwapVowelString(String str) {
		System.out.println("The input is: "+str);
		String rev= getReverseVowel(str);
		String output="";
		int count=0;
		for(int index=0;index<str.length(); index++) {
			char ch=str.charAt(index);
			if(findVowel(ch)) {
				output= output+ rev.charAt(count);
				count++;
			}
			else
				output=output+ch;
			
		}
		System.out.println("The output is: "+output);
	}
	
	public static void main(String[] args) {
		Assignment_36 swapVowel= new Assignment_36();
		String str1="good morning";
		String str2="amol";
		String str3="haorseuih";
		swapVowel.getSwapVowelString(str1);
		swapVowel.getSwapVowelString(str2);
		swapVowel.getSwapVowelString(str3);
	}

}
