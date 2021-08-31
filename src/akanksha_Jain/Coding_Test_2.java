package akanksha_Jain;

public class Coding_Test_2 {
	
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
		Coding_Test_2 test_2 = new Coding_Test_2();
		String ans = test_2.getString(input);
		System.out.println("Output- " + ans);	
	}
}
