package aniket;

public class Assignment_25_2 {

	String getString(String str) {
		String digit = "", upperCase = "", Lowercase = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digit += ch;
			else if (Character.isUpperCase(ch))
				upperCase += ch;
			else
				Lowercase += ch;
		}
			return upperCase+digit+Lowercase;
	}

	public static void main(String[] args) {
		String str = "Ma1U2liK";
		System.out.println("The updated string is : " + new Assignment_25_2().getString(str));
	}

}
