/*
 * Assignment - 29 : 7th Sep'2021
 
 Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 
 String input = "malayalam";
 boolean isPallindrome(String input){
 
 }
 
 void displayPallindromeResult(String input){
	if(isPallindrome(input))
			sop(input + " is pallindrome");
		else
			sop(input + " is not a pallindrome");
 }
 
 main(){
		String input = "madam";
		test.displayPallindromeResult(input);
 }
 
 (optional)program 3 : given number is pallindrome or not, without converting it input into String?
 int num = 12321;
 ans : true
 
 Hint : % and /
 */
 

package tanmoy_Roy.Assignment29;

import java.util.Scanner;


public class Program {

	boolean isPalindromeByRevesal(String input) {
		input=input.toLowerCase();
		String reverse="";
		int i=0,n=input.length();
		for (i=0;i<n;i++) 
			reverse+=input.charAt(n-1-i);
		if(reverse.equals(input))
			return true;
		else
			return false;
	}
	
	boolean isPalindromeWithoutRevesal(String input) {
		input=input.toLowerCase();
		boolean flag=true;
		int i=0,n=input.length();
		for (i=0;i<n/2;i++) 
			if(input.charAt(i)!=input.charAt(n-1-i)) {
				flag=false;
				break;
			}
		return flag;
	}
	
	boolean isNumberPalindrom(int input) {
		int reverse=0,num=input;
		while(num>0) {
			reverse=reverse*10+num%10;
			num/=10;
		}
		if(reverse==input)
			return true;
		else
			return false;
			
	}
	
	public static void main(String[] args) {
		Program prg = new Program();
		Scanner scan =new Scanner(System.in);
		char entermore='Y';
		while(entermore=='Y' || entermore=='y') {
			System.out.println("Enter the String : ");
			String input = scan.nextLine();
			System.out.println("The string entered is Palindrome :"+ prg.isPalindromeByRevesal(input));
			
			System.out.println("Enter the String : ");
			input = scan.nextLine();
			System.out.println("The string entered is Palindrome :"+ prg.isPalindromeWithoutRevesal(input));
			
			System.out.println("Enter the number : ");
			int num = Integer.parseInt(scan.nextLine());
			System.out.println("The number entered is Palindrome :"+ prg.isNumberPalindrom(num));
			
			System.out.println("Want to Enter more (Y/N): ");
			entermore = scan.nextLine().charAt(0);
		}
		scan.close();
	}

}
