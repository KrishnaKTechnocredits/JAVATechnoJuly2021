package vivek.Assignment24;

public class Assignment24_1 {

	String vowels = "";

	String getVowels(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u')
				if (index == str.indexOf(str.charAt(index)))
					vowels += str.charAt(index) + " ";
		}
		return vowels;
	}

	public static void main(String[] args) {
		Assignment24_1 assignment24_1 = new Assignment24_1();
		String str = "technocredits";
		System.out.println("Vowels present in the String are :- " + assignment24_1.getVowels(str));
	}
}
