package shyam;

public class ReverseString {
		
	String getReverseString(String input){
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}

	return output;
	}
	
	public static void main(String[] args){
		
		ReverseString reverseString = new ReverseString();
		String output = reverseString.getReverseString("Shyam");
		System.out.println("Reverse String is->"+output);
	}
}