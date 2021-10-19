package astha.Assignment42;

public class RemoveOccurence {
	
	void removeMultipleOccurenceOfCharacter(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == index)
				output += input.charAt(index);
		}
		System.out.println("Given input ( " + input + " ) after removing the multiple occurence is : " + output);
	}

	void removeAllOccurenceOfCharacter(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				output += input.charAt(index);
		}
		System.out.println("Given input ( " + input + " ) after removing all the occurence is : " + output);
	}

	public static void main(String[] args) {
		RemoveOccurence removeOccurence = new RemoveOccurence();
		removeOccurence.removeMultipleOccurenceOfCharacter("technocredits");
		removeOccurence.removeAllOccurenceOfCharacter("technocredits");
	}

}
