package chandni_bhoj_Assignment_20;

public class Program_3 {
	
	void getUniqueCharacters (String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				System.out.println (input.charAt(index));
					 
		}
		
	}

	public static void main(String[] args) {
		new Program_3().getUniqueCharacters("aakanksha");
	}
}
