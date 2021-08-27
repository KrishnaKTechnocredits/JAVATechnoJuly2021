package pritiCharClass_Programms;

public class Assingment_22_2 {

	void findSumOFAllDigit(String input) {
		int sum=0;
		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if (Character.isDigit(ch)) {
				sum= sum+Character.getNumericValue(ch);
			}	
		}	System.out.println("Sum of the all the digits in given string is =" +sum);
	}	
		
	public static void main(String[] a) {
		Assingment_22_2 assingment_22_2 = new Assingment_22_2();
		assingment_22_2.findSumOFAllDigit("Te11ch2no3cr4edi2ts");
	}
}
/*Program 2 : Find sum of all the digits in a given string
String str = "Te11ch2no3cr4edi2ts" 
output : 13
*/