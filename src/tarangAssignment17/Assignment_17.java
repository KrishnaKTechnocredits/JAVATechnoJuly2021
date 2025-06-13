/* Assignment - 17 : 18th Aug'2021
Write a method which takes one String parameter and return a reverse String.
Hint : String getReverseString(String input){
return output;
}
input : technocredits
output : stiderconhcet
*/

package tarangAssignment17;

public class Assignment_17 {
	
	String getReverseString(String input) {
		char reverseChar;
		System.out.print("The reverse string of " + input + " is ");
		for(int index=input.length()-1; index>=0; index--) {
			reverseChar = input.charAt(index);
			System.out.print(reverseChar);
		}
		return "Reverse";
	}

	public static void main(String[] args) {
		String input = "Technocredits";
		Assignment_17 assignment_17 = new Assignment_17();
		assignment_17.getReverseString(input);
	}
}
