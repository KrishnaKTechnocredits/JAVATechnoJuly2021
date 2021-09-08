package chandni_bhoj_Assignment_25;

public class Program_2 {
	
	void rearrangeCharacters (String input) {
		
		String upper = "";
		String digit = "";
		String lower = "";
		
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index)))
				upper += input.charAt(index);
			else if (Character.isDigit(input.charAt(index)))
				digit += input.charAt(index);
			else if (Character.isLowerCase(input.charAt(index)))
				lower += input.charAt(index);
		}
		
			System.out.println (upper + digit + lower);
	}
	
	public static void main(String[] args) {
		new Program_2 ().rearrangeCharacters("Ma1U2liK");
	}
}
