package varun.varun_string_assignment;

public class RemoveDuplicateCharacterFromGivenString {
	
	void removeDuplicateCharFromString(String str) {
		String output = "";
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
				if(str.indexOf(ch)== str.lastIndexOf(ch))
					output = output+ch;
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		String input = "technocredits";
		RemoveDuplicateCharacterFromGivenString removeDuplicateCharacterFromGivenString = new RemoveDuplicateCharacterFromGivenString();
		removeDuplicateCharacterFromGivenString.removeDuplicateCharFromString(input);
	}
}
