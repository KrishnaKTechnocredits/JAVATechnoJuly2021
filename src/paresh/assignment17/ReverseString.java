package paresh.assignment17;

public class ReverseString {
	String getReverseString(String input) {
		String output = "";
		for (int index = input.length(); index > 0; index--) {
			output = output + input.charAt(index - 1);
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "technocredits";
		ReverseString reverseestring = new ReverseString();
		System.out.println("Reverse of input string '" + input + "' is : " + reverseestring.getReverseString(input));
	}

}

/*
 * Assignment - 17 : 18th Aug'2021
 * 
 * Write a method which takes one String parameter and return a reverse String.
 * 
 * Hint : String getReverseString(String input){
 * 
 * return output; }
 * 
 * input : technocredits output : stiderconhcet
 */