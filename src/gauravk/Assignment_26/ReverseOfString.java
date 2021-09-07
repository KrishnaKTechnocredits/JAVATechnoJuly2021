package gauravk.Assignment_26;
/*
 * Assignment - 26 : 1st Sep'2021

Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}

Program : 3 
swap 2 numbers with using 3rd variable

Program : 4 
swap 2 numbers without using 3rd variable
 */
public class ReverseOfString {
	
	String reversingString(String str) {
		String s1 = "";
		for(int j=str.length()-1; j>=0; j--) {
			s1 = s1 + str.charAt(j);
		}
		
		return s1;
	}
	
	public static void main(String[] args) {
		String input = "This is technocredits";
		System.out.println("The reverse of ["+input+"] is ["+new ReverseOfString().reversingString(input)+"]");
	}
}
