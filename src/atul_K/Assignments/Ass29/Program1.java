/*
 Assignment - 29 : 7th Sep'2021
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
 */
package atul_K.Assignments.Ass29;

public class Program1 {
 
		 
		 boolean ispallindrome(String str) {
			 String revStr = "";
			 for (int index=str.length()-1;index >= 0;index--) {
				 revStr += str.charAt(index);
			 }
			 return str.equals(revStr);
		 }
		 
		 public static void main(String[] args) {
			 String input = "naman";
			 Program1 p1 = new Program1();
			 if (p1.ispallindrome(input))
				 System.out.println(input + " is pallindrome");
			 else
				 System.out.println(input + " is not pallindrome");
		}
		 
}
