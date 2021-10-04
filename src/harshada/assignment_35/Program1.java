/* Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid l=13
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid */
package harshada.assignment_35;

public class Program1 {

	boolean toCheckIsLetter(String input) {
		if (Character.isUpperCase(input.charAt(0)) && Character.isUpperCase(input.charAt(1))) // MH 
			return true;

		return false;
	}

	boolean toCheckIsDigit(String input) { // 12 4432
		for (int i=0; i< input.length(); i++) {
			if (Character.isDigit(input.charAt(i)))
				return true;
		}
		return false;
	}

	void getValidNumberPlate(String plateNum) {
		if (plateNum.length()==13) { //MH 12 BK 4432
			String[] input = plateNum.split(" ");
			if (input.length == 4) { //MH 12 BK 4432--> now data in array 
				if (input[0].length() == 2 && input[2].length() == 2) { //compare MH and BK
					if (toCheckIsLetter(input[0]) && toCheckIsLetter(input[2])) { // SEND TO check MH and BK are letter
						if (input[1].length() == 2 && input[3].length() == 4) { // 12 4432
							if (toCheckIsDigit(input[1]) && toCheckIsDigit(input[3])) { // send 12 and 4432 to check are they digit
								System.out.println(plateNum + " Is a Valid number Plate ");
							}else 
								System.out.println(plateNum + " Is Not a Valid number Plate");
						}else 
							System.out.println(plateNum + " Is Not a Valid number Plate");
					}else
						System.out.println(plateNum + " Is Not  a Valid number Plate");

				} else
					System.out.println(plateNum + " Is Not a Valid Number plate");

			} else if (input.length == 3) {
				//MH-12 BK 1432 
				if (input[0].length()==5) {
					char ch1= input[0].charAt(2);
					char ch2= input[0].charAt(3);
					char ch3= input[0].charAt(4);
					if (toCheckIsLetter(input[0]) && ch1=='-'&& Character.isDigit(ch2) && Character.isDigit(ch3)) {
						if (toCheckIsLetter(input[1]) && toCheckIsDigit(input[2])) 
							System.out.println(plateNum + " is a Valid number Plate ");
						else 
							System.out.println(plateNum + " Is Not a Valid Number plate");
					}else 
						System.out.println(plateNum + " Is Not a Valid Number plate");
				}else 
					System.out.println(plateNum + " Is Not a Valid Number plate");
			} else
				System.out.println(plateNum + " Is Not a Valid Number plate");
		}else 
			System.out.println(plateNum + " Is Not a Valid Number plate");

	}

	public static void main(String[] args) {
		Program1 p1 = new Program1();
		p1.getValidNumberPlate("MH 12 8K 432");
		p1.getValidNumberPlate("MH 12-8K 4342");
		p1.getValidNumberPlate("MH-12 MK 4342");
		p1.getValidNumberPlate("MH 12 MK 4342");
		p1.getValidNumberPlate("M- 12 MK 4342");
		p1.getValidNumberPlate("Mh 12 MK 4342");
		p1.getValidNumberPlate("1234 12 MK HH");
		p1.getValidNumberPlate("MH 12 MK GGGG");

	}

}