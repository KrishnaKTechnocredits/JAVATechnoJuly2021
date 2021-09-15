package swati.Assignment29;

import java.util.Scanner;

public class Pallindrome {
	
	String returnReverseString(String input) {
		String reverseStr="";
		for(int index=input.length()-1;index>=0;index--) {
			reverseStr=reverseStr+input.charAt(index);
		}
	
		return reverseStr;
	}
	
	boolean pallindromeWithReverseMethod(String input) {
		String reverse =returnReverseString(input);
		if(input.equals(reverse)) {
			return true;
		}
		else
			return false;
		
	}
	
	boolean pallindromeWithoutReverseMethod(String input) {
		boolean temp=false;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == input.charAt((input.length()-1)-index)) {
				temp=true;
					
			}
			
			else
				temp=false;
				
		}
		 return temp;
	}
	
	void displayPallindromeResult(String inputStr) {
		System.out.println("Output Without reverse method logic :");
		if(pallindromeWithoutReverseMethod(inputStr)) {
			System.out.println(inputStr + " is pallindrome");
		}
		else
			System.out.println(inputStr + " is not a pallindrome");
	}
	
	public static void main(String[] a) {
	
		Pallindrome p1= new Pallindrome();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String :");
		String inputStr=scan.next();
		p1.displayPallindromeResult(inputStr);
		System.out.println("\nOutput With reverse method logic :");
		if(p1.pallindromeWithReverseMethod(inputStr)) {
			System.out.println(inputStr + " is pallindrome");
		}
		else
			System.out.println(inputStr + " is not a pallindrome");
			

	}
}

