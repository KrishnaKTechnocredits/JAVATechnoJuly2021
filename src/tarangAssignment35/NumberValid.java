package tarangAssignment35;
/*Assignment - 35 : 16th Sep'2021

Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid
*/public class NumberValid {

	void getNumberPlate(String numberPlate){
		if(numberPlate.length()==13) {
		if(Character.isUpperCase(numberPlate.charAt(0)) && Character.isUpperCase(numberPlate.charAt(1))
				&& Character.isUpperCase(numberPlate.charAt(6)) && Character.isUpperCase(numberPlate.charAt(7))) {
			if(numberPlate.charAt(2)=='-' || numberPlate.charAt(2)==' ' 
					&& numberPlate.charAt(5)==' ' && numberPlate.charAt(8)==' ') {
				if(Character.isDigit(numberPlate.charAt(3)) && Character.isDigit(numberPlate.charAt(4))
						&& Character.isDigit(numberPlate.charAt(9)) && Character.isDigit(numberPlate.charAt(10)) 
						&& Character.isDigit(numberPlate.charAt(11)) && Character.isDigit(numberPlate.charAt(12))) 
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
		NumberValid v1 = new NumberValid();
		String p1 = "MH 12 BK 4432"; //valid
		String p2 = "MH-12 BK 1432"; //valid
		String p4 = "GJ 05 MK 1123"; // Valid
		String p3 = "MH 12-BK 4432"; // invalid
	System.out.println("Input :"+p1);
	v1.getNumberPlate(p1);
	System.out.println("-----------------------------------------");
		
	System.out.println("Input :"+p2);
	v1.getNumberPlate(p2);
	System.out.println("-----------------------------------------");
	
	System.out.println("Input :"+p3);
	v1.getNumberPlate(p3);
	System.out.println("-----------------------------------------");
	
	System.out.println("Input :"+p4);
	v1.getNumberPlate(p4);

	}

}
