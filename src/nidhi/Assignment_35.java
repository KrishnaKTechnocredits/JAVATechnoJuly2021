package nidhi;

/**Assignment - 35 : 16th Sep'2021

Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid 
TV1523
str.matches("^[A-Z]{2}\\d{4}")
^ Indicates that the following pattern needs to appear at the beginning of the string.
[A-Z] Indicates that the uppercase letters A-Z are required.
{2} Indicates that the preceding pattern is repeated twice (two A-Z characters).
\\d Indicates you expect a digit (0-9)
{4} Indicates the the preceding pattern is expected four times (4 digits).
**/
class Assignment_35{
	
	String verifyPlateNumber(String plateNum){
		
		String[] num = plateNum.split(" ");
		if (num[0].matches("^[A-Z]{2}")){
			if (num[1].matches("^[0-9]{2}")){
				if (num[2].matches("^[A-Z]{2}")){
					if (num[3].matches("^[0-9]{4}")){
						return "Valid";
					}else
						return "Invalid";
				}else
					return "Invalid";
			}else {
				return "Invalid";
			}
		}
		else if (num[0].matches("^[A-Z]{2}-\\d{2}")){
				if (num[1].matches("^[A-Z]{2}")){
					if (num[2].matches("^[0-9]{4}")){
						return "Valid";
					}else
						return "Invalid";
				}else
					return "Invalid";
		}else {
			return "Invalid";
		}
		
	}
	
		 public static void main(String[] arg){
			Assignment_35 assignment = new Assignment_35();
			String p1 = "MH 12 BK 4432"; //valid
			String p2 = "MH-12 BK 1432"; //valid
			String p4 = "GJ 05 MK 1123"; // Valid
			String p3 = "MH 12-BK 4432"; // invalid 
			System.out.println(assignment.verifyPlateNumber(p1));
			System.out.println(assignment.verifyPlateNumber(p2));
			System.out.println(assignment.verifyPlateNumber(p4));
			System.out.println(assignment.verifyPlateNumber(p3));
		 }
		
	
}
