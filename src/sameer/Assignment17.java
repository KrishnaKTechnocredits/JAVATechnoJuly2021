/*Write a method which takes one String parameter and return a reverse String.
Hint : String getReverseString(String input){
return output;
}
input : technocredits
output : stiderconhcet*/

package sameer;

public class Assignment17 {
	String getReverseString(String input) {
		String output = "";
		for (int index = input.length(); index > 0; index--) {
			output += input.charAt(index - 1);
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		Assignment17 assignment17 = new Assignment17();
		System.out.println("Reverse of input string is " + assignment17.getReverseString(input));
	}

}
