package akanksha_Jain;

public class Scoding_Test_2 {

	String getString(String input) {
		String output = ""; 
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				output = output + ch;
			}
			if(Character.isUpperCase(ch)) {
				char upperCase2 = Character.toLowerCase(ch);
				output = output + upperCase2;
			}
			if(Character.isLowerCase(ch)) {
				char lowerCase2 = Character.toUpperCase(ch);
				output = output + lowerCase2;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String input = "A1ashVi6";
		Scoding_Test_2 test_2 = new Scoding_Test_2();
		String ans = test_2.getString(input);
		System.out.println("Output- " + ans);	
	}
}
