/*Assignment - 35 : 16th Sep'2021
Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
 */
package atul_K.Assignments.Ass35;
public class Program1{

	boolean isValidNumberPlat(String str){
		boolean out;
		if(str.length() == 13){
			if (str.charAt(2)== ' ' || str.charAt(2)== '-'){
				if(str.charAt(5)== ' ' && str.charAt(8)== ' '){
					if(Character.isLetter(str.charAt(0)) && Character.isLetter(str.charAt(1)) && Character.isLetter(str.charAt(6))&& Character.isLetter(str.charAt(7)) && Character.isDigit(str.charAt(9)) && Character.isDigit(str.charAt(10))&&Character.isDigit(str.charAt(11))&&Character.isDigit(str.charAt(12))){
						out = true;
					} else
						out = false;
				} else
					out = false;
			} else
				out = false;
			
		} else
		out = false;
		
	return out;
	}

	public static void main(String[] args){
	String p4 = "MH-12 BK 4432";
	Program1 program1 = new Program1();
	if (program1.isValidNumberPlat(p4))
		System.out.println("Valid");
	else
		System.out.println("Invalid");
	}
} 