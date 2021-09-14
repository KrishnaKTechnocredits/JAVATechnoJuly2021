/*
 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 String input = "malayalam";
 */
package atul_K.Assignments.Ass29;

public class Program2 {

	 boolean ispallindrome(String str) {
		 boolean flag = true;
		 for(int index =0; index <str.length()/2;index++) {
			 if (str.charAt(index) != str.charAt(str.length()-1-index)) {
				flag = false;
			 	break;
			 }
		 }
		 return flag;
	 }
	 public static void main(String[] args) {
		 String input = "malayalam";
		 Program2 p2 = new Program2();
		 if (p2.ispallindrome(input))
			 System.out.println(input + " is pallindrome");
		 else
			 System.out.println(input + " is not pallindrome");
	}
}
