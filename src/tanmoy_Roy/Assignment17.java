package tanmoy_Roy;

public class Assignment17 {
	
	String getReverseString(String input) {
		String reverseString="";
		int i=input.length();
		while(i-- > 0)									//first use the value of i for comparison then decrement by 1
			reverseString+=input.charAt(i);
		
		return reverseString;
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		String input ="technocredits";
		System.out.println("Original String : "+input);
		System.out.println("After Reversal : "+assignment17.getReverseString(input));
	}

}
