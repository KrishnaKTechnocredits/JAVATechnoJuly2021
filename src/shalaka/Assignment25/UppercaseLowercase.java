/*Program2:
String str = "Ma1U2liK"
output : MUK12ali*/
package shalaka.Assignment25;

public class UppercaseLowercase {
	void getUppercaseLowercase(String str) {
		String stringUpp = "", stringlow = "", stringDigit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				stringUpp += ch + "";
			else if (Character.isLowerCase(ch))
				stringlow += ch + "";
			else if (Character.isDigit(ch))
				stringDigit += ch + "";
		}
		System.out.println(stringUpp + stringDigit + stringlow);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ma1U2liK";
		UppercaseLowercase uppercaseLowercase = new UppercaseLowercase();
		uppercaseLowercase.getUppercaseLowercase(str);
	}

}
