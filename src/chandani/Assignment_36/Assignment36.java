/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.

input : "good morning"
output: "giod mornong"

input : "amol"
output: "omal"

input : "haorseuih"
output: "hiurseoah"*/
package chandani.Assignment_36;

public class Assignment36 {
	

	String getVowels(String str) {
		
		String vowelsEnd = "";

		for (int index = str.length() - 1; index >= 0 ;index--) {
			if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || 
					str.charAt(index) == 'i' 
				|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				
				vowelsEnd += str.charAt(index);
			}
		}

		return vowelsEnd;
	}
	
	String SwitchVowels(String str) {
        int count = 0;
        String output = "";
		for(int index=0; index < str.length(); index++) {
			if(str.charAt(index) == 'a' || str.charAt(index) == 'e' || 
					str.charAt(index) == 'i' 
				|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				output = output + getVowels(str).charAt(count);
				count++;			
			}else
				output = output + str.charAt(index);
		}
	        return output;
	}
	
		
	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		String str1 = "good morning";
		String str2 = "amol";
		String str3 = "haorseuih";
		System.out.println("input : " + str1 + " \noutput : " + assignment36.SwitchVowels(str1));
		System.out.println("\ninput : " + str2 + " \noutput : " + assignment36.SwitchVowels(str2));
		System.out.println("\ninput : " + str3 + " \noutput : " + assignment36.SwitchVowels(str3));

	}
}


