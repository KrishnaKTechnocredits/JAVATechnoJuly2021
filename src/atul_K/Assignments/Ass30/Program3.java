/*
 Program 3: Verify given number is an Palindrome number.
input : 12321
output : 12321 is an Palindrome number
 */
package atul_K.Assignments.Ass30;

public class Program3 {
	boolean ispallindrome(int num) {
		 int oNum = num;
		 int revnum = 0;
		 int r = 0;
		 while(num >0){
			 r = num%10;
			 revnum = revnum * 10 + r;
			 num =num/10;
		 }
		 if(oNum == revnum)
			 return true; 
		 else
			 return false;
		 
	 }
	 public static void main(String[] args) {
		 int input = 12321;
		 Program3 p3 = new Program3();
		 if (p3.ispallindrome(input))
			 System.out.println(input + " is pallindrome");
		 else
			 System.out.println(input + " is not pallindrome");
	}
}
