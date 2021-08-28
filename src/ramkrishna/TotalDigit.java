package ramkrishna;

import java.util.Scanner;

public class TotalDigit {
	
	
	
	void totalDigits(String input) {
		
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				count++;
			}
		}
		System.out.println("Total Digits: "+count);
	}
	
	void sumAllDigit(String input) {
		int sum=0;
		for(int index=0; index<input.length();index++) {
			if (Character.isDigit(input.charAt(index))) {
				sum=sum+Character.getNumericValue(input.charAt(index));
			}
		} System.out.println("sum of all the digits: "+sum);
	}
	
	public static void main(String[] arg) {
		 TotalDigit totaldigit = new TotalDigit();
		 Scanner scan =new Scanner(System.in);
	     System.out.println("Enter String:");
		 
	     String inputString= scan.next();
		 totaldigit.totalDigits(inputString);
		
		 //Scanner scan =new Scanner(System.in);
		 System.out.println("Enter String");
		 
		 inputString=scan.next();
		 totaldigit.sumAllDigit(inputString);
	 
 }
	
}