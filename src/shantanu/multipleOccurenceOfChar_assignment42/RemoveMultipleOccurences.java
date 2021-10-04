package shantanu.multipleOccurenceOfChar_assignment42;

public class RemoveMultipleOccurences {
	void displayNewString(String input) {
		String output = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch)) {
				if(!output.contains(Character.toString(ch)))
						output += ch;
			}
			else
				output += ch;
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		RemoveMultipleOccurences removeMultipleOccurences = new RemoveMultipleOccurences();
		String input = "technocredits";
		removeMultipleOccurences.displayNewString(input);
	}
}
