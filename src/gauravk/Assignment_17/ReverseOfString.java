package gauravk.Assignment_17;
/*
 * Assignment - 17 : 18th Aug'2021
Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet
 */
public class ReverseOfString {
	
	String getReverseString(String inp) {
		String output = ""; 
				//Character.toString(inp.charAt(inp.length()));
		for(int i=inp.length()-1; i>=0; i--) {
			output = output + Character.toString(inp.charAt(i));
		}
		return output;
	}
	
	public static void main(String[] a) {
		String input = "technocredits";
		System.out.println("The reverse of the string "+input+" is: "+new ReverseOfString().getReverseString(input));
	}
}
