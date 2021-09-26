package devendra_Assignment_34;

public class Assignment34_3_NonReapeatingVovel {
	char getFirstUniqueVowel(String s) {
		char output = ' ';
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u')) {
				if(i == s.lastIndexOf(s.charAt(i))) {
					output = s.charAt(i);
					break;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "aeapquawrpti";
		System.out.println("Input : " +input);
		System.out.println("Output : " +new Assignment34_3_NonReapeatingVovel().getFirstUniqueVowel(input));
	}
}