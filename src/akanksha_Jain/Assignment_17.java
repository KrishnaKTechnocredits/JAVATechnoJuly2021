package akanksha_Jain;

public class Assignment_17 {
	
	String getReverseString(String input) {
		char reverseChar;
		System.out.print("The reverse string of " + input + " is ");
		for(int index=input.length()-1; index>=0; index--) {
			reverseChar = input.charAt(index);
			System.out.print(reverseChar);
		}
		return "Invalid Input";
	}

	public static void main(String[] args) {
		String input = "Technocredits";
		Assignment_17 assignment_17 = new Assignment_17();
		assignment_17.getReverseString(input);
	}
}
