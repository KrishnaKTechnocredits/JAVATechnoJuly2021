/*  Assignment - 17 : 18th Aug'2021
Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}
input : technocredits
output : stiderconhcet   */
package atul_K.Assignments.Ass17;

public class Program1 {
	
	String revString (String str) {
		String out = "";
		for (int index=str.length()-1; index >=0 ; index--) {
			out = out + str.charAt(index);
		}
		return out;
	}

	/*String reverse(String str) {
		String target ="";
		char[] ch = new char[str.length()];
		for(int index=0;index < str.length();index++) {
			ch[str.length()-1-index] = str.charAt(index);
		}
		return target.copyValueOf(ch);
	}*/
	
	public static void main (String[] args) {
		String str = "technocredits";
		Program1 program1 =new Program1();
		System.out.println(program1.revString(str));
	}
}
