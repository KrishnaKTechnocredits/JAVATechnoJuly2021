package kalpesh;

public class Assignment_25_Program_2 {

	void upperDigitLowerFormatOfString(String str) {
		String upper = "", lower = "", digit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				upper = upper + ch;
			else if (Character.isLowerCase(ch))
				lower = lower + ch;
			else
				digit = digit + ch;
		}
		System.out.println("Output for the given input is : " + upper + digit + lower);
	}

	public static void main(String[] args) {
		Assignment_25_Program_2 program2 = new Assignment_25_Program_2();
		program2.upperDigitLowerFormatOfString("Ma1U2liK");
	}

}

/*
 * Program2: 
 * String str = "Ma1U2liK" 
 * output : MUK12ali
 * 
 */