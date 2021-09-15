package aniket;

public class Scoding_Test_2 {

	String getUpperLowerCase(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch))
				output+=ch;
			if(Character.isUpperCase(ch)) {
				char convertLoweCase = Character.toLowerCase(ch);
				output+=convertLoweCase;
			}
			if(Character.isLowerCase(ch)) {
				char convertUpperCase = Character.toUpperCase(ch);
				output+=convertUpperCase;
				
			}
			
			
		}
		return output;
		}
		
	

	public static void main(String[] args) {
		String input = "A1ashVi6";
		System.out.println(new Scoding_Test_2().getUpperLowerCase(input));
	}

}
