//Assignment 17 [Return reverse string] DATE: 08/18
package deepak.Assignment_17;

public class ReverseString {
	
	String reverseString(String str) {
		String str1="";
		char[] s=str.toCharArray();	
		
		for(int i = str.length()-1 ; i >= 0; i--) {
			str1=str1+s[i];	
		}
		return str1;
	}
	
	public static void main(String[] args) {
		ReverseString obj=new ReverseString();
		System.out.print("Reverse of the string is: ");
		System.out.print(obj.reverseString("technocredits"));
	}
}
