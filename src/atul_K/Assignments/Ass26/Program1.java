/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */
package atul_K.Assignments.Ass26;

public class Program1 {
	
	
	String reverseString(String str) {
		String out = "";
		for (int index=0;index < str.length();index++) {
			out = out + str.charAt(str.length()- 1-index);
		}
		return out;
	}
	public static void main(String[] args) {
		String str = "This is technocredits";
		Program1 p1 = new Program1();
		System.out.println(p1.reverseString(str));
	}
	
	
	
	
}
