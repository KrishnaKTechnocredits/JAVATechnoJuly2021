package arti_G;
/*Assignment 17
Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet*/
public class StringReverse {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		System.out.println("Reverse string output is: ");
		System.out.println(stringReverse.reverseString("technocredits"));
	}

}
