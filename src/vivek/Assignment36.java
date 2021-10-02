/*WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse.  
input : "good morning"
output: "giod mornong"
input : "amol"
output: "omal"
input : "haorseuih"
output: "hiurseoah"*/

package vivek;

public class Assignment36 {

	void swapVowel(String str) {
		String output = "";
		String reverseVowels = getReverseVowels(str);
		int cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) != 'a' && str.charAt(index) != 'e' && str.charAt(index) != 'i'
					&& str.charAt(index) != 'o' && str.charAt(index) != 'u')
				output += str.charAt(index);
			else if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				output += reverseVowels.charAt(cnt);
				cnt++;
			}
		}
		System.out.println(output);
	}

	String getReverseVowels(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				output += str.charAt(index);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		String str = "good morning";
		assignment36.swapVowel(str);
		String str1 = "amol";
		assignment36.swapVowel(str1);
		String str2 = "haorseuih";
		assignment36.swapVowel(str2);
	}
}
