package Sourabh_Assignment_25;

public class StringFormat {

	void upperDigitLowerFormatOfString(String str) {
		String upper = "", lower = "", digit = "";
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch))
				upper = upper + ch;
			else if(Character.isLowerCase(ch))
				lower = lower + ch;
			else
				digit = digit + ch;
		}
		System.out.println("Output : "+upper+digit+lower);
	}

	public static void main(String[] args) {
		StringFormat stringformat = new StringFormat();
		stringformat.upperDigitLowerFormatOfString("Ma1U2liK");
	}

}
