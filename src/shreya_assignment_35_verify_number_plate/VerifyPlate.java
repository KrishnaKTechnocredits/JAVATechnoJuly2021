/*Assignment - 35 : 16th Sep'2021

Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
*/

package shreya_assignment_35_verify_number_plate;

public class VerifyPlate {
	void getNumberPlate(String str) {
		if(str.length()==13) {
			if(Character.isUpperCase(str.charAt(0))&&Character.isUpperCase(str.charAt(1))&&Character.isUpperCase(str.charAt(6))&&Character.isUpperCase(str.charAt(7))) {
				if((str.charAt(2)==' '&&str.charAt(5)==' '&&str.charAt(8)==' ')||(str.charAt(2)=='-'&&str.charAt(5)==' '&&str.charAt(8)==' ')){
					if(Character.isDigit(str.charAt(3))&&Character.isDigit(str.charAt(4))&&Character.isDigit(str.charAt(9))&&Character.isDigit(str.charAt(10))&&Character.isDigit(str.charAt(11))&&Character.isDigit(str.charAt(12))) {
						System.out.println("Valid number plate "+str);
					}
					else
						System.out.println("Invalid number plate "+str);
				}
				else
					System.out.println("Invalid number plate "+str);
			}
			else
				System.out.println("Invalid number plate "+str);
		}
		else
			System.out.println("Invalid number plate "+str);
	}
	public static void main(String[] args) {
		VerifyPlate verifyPlate = new VerifyPlate();
		String str1="MH 12 BK 4432";
		String str2="MH-12 BK 1432";
		String str3="GJ 05 MK 1123";
		String str4="Mk 12-Bk 4432";
		verifyPlate.getNumberPlate(str1);
		verifyPlate.getNumberPlate(str2);
		verifyPlate.getNumberPlate(str3);
		verifyPlate.getNumberPlate(str4);

	}

}
