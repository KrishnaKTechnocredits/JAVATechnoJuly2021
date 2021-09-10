package akshay;

public class Assignment29_1 {
	
	void getPallindromeString(String input) {

		String output = "";
		for(int index = input.length()-1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		if(input.equals(output)) {
			System.out.println("It is a palindorme string");
		}
		else {
			System.out.println("It is not a palindrome String");
		}
	}
	
	
	
	public static void main(String[] args) {
		Assignment29_1 assignment29_1 = new Assignment29_1();
		String input = "naman";
		assignment29_1.getPallindromeString(input);
		String input1 = "aabbaa";
		assignment29_1.getPallindromeString(input1);
		String input2 = "akshay";
		assignment29_1.getPallindromeString(input2);
	}
}
