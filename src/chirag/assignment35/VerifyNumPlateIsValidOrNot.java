package chirag.assignment35;

/*Write a program to verify given number plat number is valid or not.
String p1 = "MH 12 BK 4432"; //valid
String p2 = "MH-12 BK 1432"; //valid
String p4 = "GJ 05 MK 1123"; // Valid
String p3 = "MH 12-BK 4432"; // invalid*/

public class VerifyNumPlateIsValidOrNot {
	
	 void getValidNumPlate(String str) {
		 if(str.length()==13) {
		
			 if(Character.isUpperCase(str.charAt(0))&& Character.isUpperCase(str.charAt(1))&&
					 Character.isUpperCase(str.charAt(6))&& Character.isUpperCase(str.charAt(7))) {
				 
				 if((str.charAt(2)==' ' && str.charAt(5)==' ' && str.charAt(8)==' ')
							||(str.charAt(2)=='-' && str.charAt(5)==' ' && str.charAt(8)==' ')) {
					 
					 if(Character.isDigit(str.charAt(3))&& Character.isDigit(str.charAt(4))&&
							 Character.isDigit(str.charAt(9))&& Character.isDigit(str.charAt(10))&&
							 Character.isDigit(str.charAt(11))&&Character.isDigit(str.charAt(12))) {
						 
						 System.out.println("Valid number plate : "+str);
						 
					 }
					 else
						 System.out.println("InValid number plate : "+str);
					 
				 }
				 else
					 System.out.println("InValid number plate : "+str);
					 
				 
			 }
			 else
				 System.out.println("InValid number plate : "+str);
			 
		 }
		 else
			 System.out.println("InValid number plate : "+str);
	 }
		
	public static void main(String[] args) {
		VerifyNumPlateIsValidOrNot isValidOrNot=new VerifyNumPlateIsValidOrNot();
		String str = "MH 12 BK 4432";
		isValidOrNot.getValidNumPlate(str);
		System.out.println("--------------------");
		String p2 = "MH-12 BK 1432";
		isValidOrNot.getValidNumPlate(p2);
		System.out.println("--------------------");
		String p3 = "GJ 01 MK 1123";
		isValidOrNot.getValidNumPlate(p3);
		System.out.println("--------------------");
		String p4 = "MH 12 BK 4432";
		isValidOrNot.getValidNumPlate(p4);
		System.out.println("----------------------");
		String p5 = "MH 12 BK 443";
		isValidOrNot.getValidNumPlate(p5);
		
		System.out.println("----------------------");
		String p6 = "MH 1 BK 4432";
		isValidOrNot.getValidNumPlate(p6);
	
		System.out.println("----------------------");
		String p7 = "MH 12 B1 4434";
		isValidOrNot.getValidNumPlate(p7);
		
		System.out.println("----------------------");
		String p8 = "M1 12 BK 4438";
		isValidOrNot.getValidNumPlate(p8);
		
		System.out.println("----------------------");
		String p9 = "MH 12 BK-4438";
		isValidOrNot.getValidNumPlate(p9);
		
		System.out.println("----------------------");
		String p10 = "mh 12 BK 4438";
		isValidOrNot.getValidNumPlate(p10);
	}
}