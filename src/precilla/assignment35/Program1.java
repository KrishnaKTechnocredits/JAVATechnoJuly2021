
/*Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
*/
package precilla.assignment35;

import java.util.Arrays;

public class Program1 {
	void getNumberPlate(String numberPlate) {
		if(numberPlate.length()==13) {
				if(Character.isUpperCase(numberPlate.charAt(0))&&Character.isUpperCase(numberPlate.charAt(1))&&Character.isUpperCase(numberPlate.charAt(6))&&Character.isUpperCase(numberPlate.charAt(7))){
					if(numberPlate.charAt(2)=='-'||numberPlate.charAt(2)==' '&&numberPlate.charAt(5)==' '&&numberPlate.charAt(8)==' ') {
						if(Character.isDigit(numberPlate.charAt(3))&&Character.isDigit(numberPlate.charAt(4))&&Character.isDigit(numberPlate.charAt(9))&&Character.isDigit(numberPlate.charAt(10))&&Character.isDigit(numberPlate.charAt(11))&&Character.isDigit(numberPlate.charAt(12)))
							System.out.println("\nOutput: Valid");
						else 
							System.out.println("\nOutput: Invalid");
					}else 
						System.out.println("\nOutput: Invalid");
				}else 
					System.out.println("\nOutput: Invalid");
		}
		else 
			System.out.println("\nOutput: Invalid");
	}
	public static void main(String[] args) {
		Program1 p=new Program1();
		System.out.println("Program to verify given number plate number is valid or not.");
		String p1 = "MH 12 BK 4432"; //valid
		System.out.print("Input :" +p1);
		p.getNumberPlate(p1);
		String p2 = "MH-12 BK 1432"; //valid
		System.out.print("\nInput :" +p2);
		p.getNumberPlate(p2);
		String p3 = "MH 12-BK 4432"; // invalid
		System.out.print("\nInput :" +p3);
		p.getNumberPlate(p3);
		String p4 = "GJ 05 MK 1123"; // Valid
		System.out.print("\nInput :" +p4);
		p.getNumberPlate(p4);
	
	}

}
