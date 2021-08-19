package astha.Assignment17;

public class ReverseString {
	
	String getReverseString(String input) {
		String outputString= "";
		for(int index=input.length()-1; index>=0;index--) {
			outputString += input.charAt(index);
		}
		return outputString;
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.getReverseString("technocredits"));
	}

}
