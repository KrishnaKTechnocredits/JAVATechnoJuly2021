/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT */

package monika;

public class Assignment26_Program_1 {

	String getReverseString(String input) {
		String output="";
		for(int index=input.length()-1;index>=0; index--) 
			output+=input.charAt(index);
		return output;
	}
	public static void main(String[] args) {
		Assignment26_Program_1 assignment26_Program_1=new Assignment26_Program_1();
		String reverseString=assignment26_Program_1.getReverseString("This is technocredits");
		System.out.println("Reverse String is: " +reverseString);
	}
}
