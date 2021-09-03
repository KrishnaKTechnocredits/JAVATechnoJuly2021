package kalpesh;

public class Assignment_26_Program_1 {
	String reverseString(String input) {
		String output = "";
		char ch;
		for (int index = input.length() - 1; index >= 0; index--) {
			ch = input.charAt(index);
			output += ch;
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "This is technocredits";
		String answer = new Assignment_26_Program_1().reverseString(input);
		System.out.println(answer);
	}

}

/*
 * Program : 1 WAP to print Reverse a given String.
 * input : This istechnocredits 
 * output : stiderconhcet si sihT
 */