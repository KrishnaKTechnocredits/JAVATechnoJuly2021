package akanksha_Jain.Assignment_25;

public class Program_2 {
	
	String getString(String input) {
		String output, digit = "", upperCase="", lowerCase="";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch))
				digit = digit + ch;
			else if(Character.isUpperCase(ch))
				upperCase = upperCase + ch;
			else if(Character.isLowerCase(ch))
				lowerCase = lowerCase + ch;
		}
		output = upperCase + digit + lowerCase;
		return output;
	}
	
	public static void main(String[] args) {
		String input = "Ma1U2liK"; //output should be : MUK12ali
		Program_2 program_2 = new Program_2();
		String ans = program_2.getString(input);
		System.out.println("Output- " + ans);	
	}
}
