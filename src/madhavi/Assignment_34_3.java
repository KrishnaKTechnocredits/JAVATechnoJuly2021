package madhavi;

public class Assignment_34_3 {
	void getNonRepeatingVowelCharacter(String input) {

		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			for (int index1 = 0; index1 < input.length(); index1++) {
				if (input.charAt(index) == input.charAt(index1)) {
					if (input.charAt(index1) == 'a' || input.charAt(index1) == 'e' || input.charAt(index1) == 'i'
							|| input.charAt(index1) == 'o' || input.charAt(index1) == 'u') {
						count++;
						if (count > 1)
							break;
					}
				}
			}
			if (count == 1) {
				System.out.println("Output: " + input.charAt(index));
				break;
			}

		}

	}

	public static void main(String[] args) {
		Assignment_34_3 assignment_34_3 = new Assignment_34_3();
		String input = "aeapquawrpti";
		assignment_34_3.getNonRepeatingVowelCharacter(input);
	}
}
