/*Assignment - 29 : 7th Sep'2021
 
 Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Pallindrome by without writing reverse method logic.*/
 
package chandani.Assignment29;

import java.util.Scanner;

public class Assignment29a{
	
	String getReverseString(String input){
		String output = "";
		for (int index = input.length()-1;index >= 0; index--){
			 output = output + input.charAt(index); 
		}
			return output;
	}
	
	public static void main (String[] args){
		Assignment29a assignment29a = new Assignment29a();	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the palindrome string : ");
		String input = scanner.nextLine();
		String output = assignment29a.getReverseString(input);
		if (output.equalsIgnoreCase(input)) {
			System.out.println("User entered string is palindrome");
		}else
			System.out.println("User entered string is not a palindrome");
	}		
}