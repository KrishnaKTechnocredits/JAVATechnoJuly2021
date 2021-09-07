package akanksha_Jain.Assignment_26;

public class Program_1 {

	String reverseString(String input) {
		String output = "";
		char ch;
		for(int index=input.length()-1; index>=0; index--) {
			ch = input.charAt(index);
			output += ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String input = "This is technocredits";
		String answer = new Program_1().reverseString(input);
		System.out.println(answer);
	}
}
