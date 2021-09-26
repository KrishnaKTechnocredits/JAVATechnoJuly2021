/*
Assignment - 35 : 16th Sep'2021

Write a program to verify given number plate number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
*/

package ritabrata2;

public class Assignment35 {
	
	boolean isValidChar(String input) {
		boolean flag=false;
		if(Character.isUpperCase(input.charAt(0)) && Character.isUpperCase(input.charAt(1)) && Character.isUpperCase(input.charAt(6)) && Character.isUpperCase(input.charAt(7))) {
			if(Character.isDigit(input.charAt(3)) && Character.isDigit(input.charAt(4))) {
				for(int i=9; i<input.length(); i++) {
					if(Character.isDigit(input.charAt(i))) {
						flag=true;
					}
					else {
						flag=false;
						break;
					}
				}
			}	
		}
		return flag;	
	}
	
	void verifyNumberPlate(String input) {
		System.out.println("The registration number is: "+input);
		boolean validPlate= true;
		if(input.length()==13) {
			if(input.charAt(2)==' '&& input.charAt(5)==' '&& input.charAt(8)==' ') {
				if(isValidChar(input))
					validPlate=true;
				else
					validPlate=false;
			}
			else if(input.charAt(2)=='-'&& input.charAt(5)==' '&& input.charAt(8)==' ') {
				if(isValidChar(input))
					validPlate=true;
				else
					validPlate=false;
			}
			else
				validPlate=false;
		}
		else
			validPlate=false;
		if(validPlate)
			System.out.println("The number plate is valid ");
		else
			System.out.println("The number plate is invalid, report to RTO");
	}
	
	public static void main(String[] args) {
		Assignment35 plate= new Assignment35();
		String p1 = "MH 12 BK 4432";
		String p2 = "MH-12 BK 1432"; 
		String p3 = "MH 12-BK 4432";
		String p4 = "GJ 05 MK 1123";
		String p5 = "WB 42 AX 3453"; 
		plate.verifyNumberPlate(p1);
		System.out.println("-------------------");
		plate.verifyNumberPlate(p2);
		System.out.println("-------------------");
		plate.verifyNumberPlate(p3);
		System.out.println("-------------------");
		plate.verifyNumberPlate(p4);
		System.out.println("-------------------");
		plate.verifyNumberPlate(p5);
	}
}