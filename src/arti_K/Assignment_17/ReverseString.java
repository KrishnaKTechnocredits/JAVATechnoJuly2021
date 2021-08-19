/*  Assignment - 17 : 18th Aug'2021
Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}
input : technocredits
output : stiderconhcet   */

package arti_K.Assignment_17;

public class ReverseString {
	
	void reverseString(String str) {
		System.out.print("Reverse String of 'technocredits' : ");
		for(int index = str.length()-1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}
	public static void main(String[] args) {
		ReverseString reversestr = new ReverseString();
		reversestr.reverseString("technocredits");
	}
}
