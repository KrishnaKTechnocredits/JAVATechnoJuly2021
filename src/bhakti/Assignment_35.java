/*Assignment - 35 : 16th Sep'2021

Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid//-13,  spaces 2, 5, 8   01, 67, 34  9 10 11 12 
			0123456789101112	
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
"mh 12
*/

package bhakti;

public class Assignment_35 {

	boolean tocheckisLetter(String input) {
		if (Character.isUpperCase(input.charAt(0)) && Character.isUpperCase(input.charAt(1)))
			return true;

		return false;
	}
	
	boolean toCheckDigit(String input) {
		for (int i=0; i< input.length(); i++) {
			if (Character.isDigit(input.charAt(i)))
				return true;
		}
		return false;
	}

	void toCheckValidNumber(String platNum) {
		if (platNum.length()==13) {
			String[] input = platNum.split(" ");
			if (input.length == 4) {
				if (input[0].length() == 2 && input[2].length() == 2) {
					if (tocheckisLetter(input[0]) && tocheckisLetter(input[2])) {
						if (input[1].length() == 2 && input[3].length() == 4) {
							if (toCheckDigit(input[1]) && toCheckDigit(input[3])) {
								System.out.println("Valid numberPlat ");
							}else 
								System.out.println("Not Valid Number");
						}else 
							System.out.println("Not Valid Number");
					}else
						System.out.println("Not Valid Number");
	
				} else
					System.out.println("Not Valid Number");
	
			} else if (input.length == 3) {
				//MH-12 BK 1432 
				if (input[0].length()==5) {
					char ch1= input[0].charAt(2);
					char ch2= input[0].charAt(3);
					char ch3= input[0].charAt(4);
					if (tocheckisLetter(input[0]) && ch1=='-'&& Character.isDigit(ch2) && Character.isDigit(ch3)) {
						if (tocheckisLetter(input[1]) && toCheckDigit(input[2])) 
							System.out.println("Valid numberPlat");
						else 
							System.out.println("Not Valid Number");
					}else 
						System.out.println("Not Valid Number");
				}else 
					System.out.println("Not Valid Number");
			} else
				System.out.println("Not Valid Number");
		}else 
			System.out.println("Not Valid Number");

	}

	public static void main(String[] args) {
		Assignment_35 p1 = new Assignment_35();
		p1.toCheckValidNumber("MH 12 8K 432");
		p1.toCheckValidNumber("MH 12-8K 4342");
		p1.toCheckValidNumber("MH-12 MK 4342");
		p1.toCheckValidNumber("MH 12 MK 4342");
		p1.toCheckValidNumber("M- 12 MK 4342");
		p1.toCheckValidNumber("Mh 12 MK 4342");
		p1.toCheckValidNumber("4342 12 MK HH");
		p1.toCheckValidNumber("MH 12 MK GGGG");

	}

}
