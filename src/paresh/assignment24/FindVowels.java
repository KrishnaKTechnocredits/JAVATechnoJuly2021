package paresh.assignment24;

/*Assignment - 24 : 28th Aug'2021
Program 1: Java Program to Count the Number of Vowels in user defined string.
Input : technocredits
output : vowels are e , o, i*/ 

public class FindVowels {

	void findVowel(String str) {
		String vowels = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (index == str.indexOf(ch)) {
					if (vowels != "")
						vowels = vowels + ",";
					vowels = vowels + ch + "";
				}
			}
		}
		System.out.println("Vowels in a given String : " + vowels);
	}

	public static void main(String[] args) {
		FindVowels findVowelsInAgivenString = new FindVowels();
		findVowelsInAgivenString.findVowel("technocredits");
	}
}