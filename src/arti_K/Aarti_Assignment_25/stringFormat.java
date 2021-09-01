/* Program2:
String str = "Ma1U2liK"
output : MUK12ali */

package arti_K.Aarti_Assignment_25;

public class stringFormat {
	
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
		stringFormat stringformat = new stringFormat();
		stringformat.upperDigitLowerFormatOfString("Ma1U2liK");
	}

}
