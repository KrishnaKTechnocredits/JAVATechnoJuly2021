package shantanu.multipleOccurenceOfChar_assignment42;

public class RemoveAllOccurences {
	void displayNewString(String input) {
		String output = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				output += ch;
			}
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		RemoveAllOccurences removeAllOccurences = new RemoveAllOccurences();
		String input = "technocredits";
		removeAllOccurences.displayNewString(input);
	}
}
