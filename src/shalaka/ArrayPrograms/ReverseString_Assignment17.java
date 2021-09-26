
/*Write a method which takes one String parameter and return a reverse String.


Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet*/
package shalaka.arrayprograms;

public class ReverseString_Assignment17 {
	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output+input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		ReverseString_Assignment17 reverseString_Assignment17 = new ReverseString_Assignment17();
		String str = reverseString_Assignment17.getReverseString(input);
		System.out.println("Reverse String of " + input + " is " + str);
	}
}
