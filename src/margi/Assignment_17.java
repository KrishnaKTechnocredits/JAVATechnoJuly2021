package margi;

public class Assignment_17 {

	//takes one String parameter and return a reverse String
	String reverseStr(String input) {
		String output = "";
		for(int index=input.length()-1; index > 0 ; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment_17 str = new Assignment_17();
		System.out.println(str.reverseStr("technocredits"));
	}
}
