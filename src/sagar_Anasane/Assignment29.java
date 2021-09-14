/*Assignment - 29 : 7th Sep'2021
 
 Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 
 String input = "malayalam";*/package sagar_Anasane;

public class Assignment29 {
	String getPalindromeUsingReverseMethodLogic(String inp) {
		String rev = "";
		for(int index=inp.length()-1;index>=0;index--) {
			char ch = inp.charAt(index);
			rev = rev + ch;
		}
		if(inp.equals(rev)) {
			System.out.println("\n"+inp+" is Palindrome");
		}else
			System.out.println("\n"+inp+" is not Palindrome");
		return inp;
	}
	
	boolean isPalindrome(String input) {
		for(int index=0,nIndex=input.length()-1;index<input.length();index++,nIndex--) {
			char ch=input.charAt(index);
			char ch1=input.charAt(nIndex);
			if(ch!=ch1) {
				return false;
			}
		}
		return true;
	}
	
	void displayPalindromeResult(String input) {
		if(isPalindrome(input)) {
			System.out.println("\n"+input +" is Palindrome");
		}else
			System.out.println("\n"+input +" is not Palindrome");
	}
	
	
	
	public static void main(String[] args) {
		String input = "naman";
		String input1 = "malayalam";
		String input2 = "aabbaa";
		Assignment29 assignment29 = new Assignment29();
		System.out.println("Palindrome using Reverse String Logic");
		assignment29.getPalindromeUsingReverseMethodLogic(input);
		System.out.println("\n"+"Palindrome using Without Reverse String Logic");
		assignment29.displayPalindromeResult(input1);
		assignment29.displayPalindromeResult(input2);
		assignment29.displayPalindromeResult(input);
		
	}
}
