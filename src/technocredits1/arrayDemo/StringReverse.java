package technocredits1.arrayDemo;

// char charAt(int index)
public class StringReverse {

	String reverseString(String input) {
		String output = "";
		for(int index=input.length()-1;index>=0;index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	
	public static void main(String[] args) {
		StringReverse stringR = new StringReverse();
		String reverseString = stringR.reverseString("technocredits");
		System.out.println(reverseString);
	}
}
