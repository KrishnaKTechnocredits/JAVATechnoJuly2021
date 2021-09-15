package chirag.codingTest;

public class FindFirstNonRepeatingCharacter {
	
	void nonRepeatingCharacter(String input) {
		boolean status = false;
		for(int index = 0;index < input.length();index++) {
			status = true;
			char ch=input.charAt(index);
			for(int j = 0;j < input.length();j++) {
				if(ch == input.charAt(j) && j != index) {
					status =false;
					break;
				}
			}
			if(status) {
				System.out.println("First non repeating character is : "+ch);
			break;
			}
			}
		if(!status) {
			System.out.println("No single character is found");
	}
	}
	public static void main(String[] args) {
		FindFirstNonRepeatingCharacter findFirstNonRepeatingCharacter = new FindFirstNonRepeatingCharacter();
		findFirstNonRepeatingCharacter.nonRepeatingCharacter("technocredits");
	}
}