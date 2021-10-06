/*Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p3 = "GJ 05 MK 1123"; // Valid
String p4 = "MH 12-BK 4432"; // invalid
*/

package vivek;

public class Assignment35 {

	static void checkNumberValidity(String str) {
		if (str.length() == 13) {
			if (Character.isLetter(str.charAt(0)) && Character.isLetter(str.charAt(1))) {
				if (str.charAt(2) == 32 || str.charAt(2) == 45) {
					if (Character.isDigit(str.charAt(3)) && Character.isDigit(str.charAt(4))) {
						if (str.charAt(5) == 32) {
							if (Character.isLetter(str.charAt(6)) && Character.isLetter(str.charAt(7))) {
								if (str.charAt(8) == 32) {
									if (Character.isDigit(str.charAt(9)) && Character.isDigit(str.charAt(10))
											&& Character.isDigit(str.charAt(11))
											&& Character.isDigit(str.charAt(12))) {
										System.out.println(str + " is a valid number");
									} else
										System.out.println(str + " is an invalid number");
								} else
									System.out.println(str + " is an invalid number");
							} else
								System.out.println(str + " is an invalid number");
						} else
							System.out.println(str + " is an invalid number");
					} else
						System.out.println(str + " is an invalid number");
				} else
					System.out.println(str + " is an invalid number");
			} else
				System.out.println(str + " is an invalid number");
		} else
			System.out.println(str + " is an invalid number");
	}

	public static void main(String[] args) {
		String p1 = "MH 12 BK 4432";
		String p2 = "MH-12 BK 1432";
		String p3 = "GJ 05 MK 1123";
		String p4 = "MH 12-BK 4432";
		Assignment35.checkNumberValidity(p1);
		Assignment35.checkNumberValidity(p2);
		Assignment35.checkNumberValidity(p3);
		Assignment35.checkNumberValidity(p4);
	}
}
