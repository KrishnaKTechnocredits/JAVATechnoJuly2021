package pritiCharClass_Programms;

public class Assingment_22_1 {
	void findTotalDigits(String str) {
		int cnt=0;
		for (int index=0; index<str.length(); index++) {
		char ch = str.charAt(index);
				if (Character.isDigit(ch)) {
					cnt++;
				}
		}System.out.println("Count of the all the digits in given string is = "+cnt);
		
	}
	public static void main(String[] a) {
		Assingment_22_1 assingment_22_1 = new Assingment_22_1();
		assingment_22_1.findTotalDigits("Te1ch2no3cr4ed3it4s");
	}
}

/*Program 1 : Find total digits in a given string.
String str = "Te1ch2no3cr4ed3it4s" 
output : 6
*/