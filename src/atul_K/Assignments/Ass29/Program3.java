/*program 3 : given number is pallindrome or not, without converting it input into String?
 int num = 12321;
 ans : true
 Hint : % and /
 */
package atul_K.Assignments.Ass29;

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
		 int input = 23432;
		 Program3 p3 = new Program3();
		 if (p3.ispallindrome(input))
			 System.out.println(input + " is pallindrome");
		 else
			 System.out.println(input + " is not pallindrome");
	}
}
