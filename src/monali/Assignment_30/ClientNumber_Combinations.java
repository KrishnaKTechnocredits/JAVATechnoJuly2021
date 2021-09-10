package monali.Assignment_30;

public class ClientNumber_Combinations extends Number_Combinations {

	public static void main(String[] args) {
		ClientNumber_Combinations cnc = new ClientNumber_Combinations();
		System.out.println("1932" + " reverse number is :  " + cnc.reverseNumber(1932));
		cnc.verifyArmstrongNumber(153);
		cnc.verifyArmstrongNumber(100);
		cnc.verifyPalindromeNumber(12321);
		cnc.verifyPalindromeNumber(1354);
		cnc.verifyPerfectNumber(28);
		cnc.verifyPerfectNumber(166);
	}
}
