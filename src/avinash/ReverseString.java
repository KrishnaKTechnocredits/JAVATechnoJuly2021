package avinash;

/*
 * Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}
input : technocredits
output : stiderconhcet
 * 
 * 
 */
public class ReverseString {

	int getReverseString(String input) {
		char[] ch = input.toCharArray();
		int length = ch.length;
		for (int index = length; index > 0; index--) {
			System.out.print(ch[index - 1]);
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "technocredits";
		ReverseString reverseString = new ReverseString();
		reverseString.getReverseString(input);
	}

}