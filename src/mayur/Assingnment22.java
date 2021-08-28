/*
 * Assignment - 22 : 25th Aug'2021
Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6	
 */

package mayur;

public class Assingnment22 {

	void getDigitFromString(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Total digit in given string is : " + count);

	}

	public static void main(String[] args) {

		Assingnment22 assingnment22 = new Assingnment22();
		String Str = "Te1ch2no3cr4ed3it4s";
		assingnment22.getDigitFromString(Str);
	}

}
