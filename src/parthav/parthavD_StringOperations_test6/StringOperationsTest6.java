//Program 1: Find first non repeating character from a word. [expected : 10 mins]
//input : technocredits
//output : h 

package parthav.parthavD_StringOperations_test6;

public class StringOperationsTest6 {

	char getNonRepeatingCharacterFromString(String inputStr) {
		for (int index = 0; index < inputStr.length(); index++) {
			char ch = inputStr.charAt(index);
			if (index == inputStr.lastIndexOf(ch) && index == inputStr.indexOf(ch)) {
				return ch;
			}
		}
		return 0;

	}
	
	void printFirstNonRepeatingCharacterFromString (String inputStr) {
		if (getNonRepeatingCharacterFromString(inputStr) == 0)
			System.out.println("The string " + inputStr + "  does not have any non-repeating characters");
		else
			System.out.println("The first non-repeating character in string " + inputStr + " is " + getNonRepeatingCharacterFromString(inputStr));
	}
	

	public static void main(String[] args) {
		StringOperationsTest6 newObject = new StringOperationsTest6();
		newObject.printFirstNonRepeatingCharacterFromString("technocredits");
		newObject.printFirstNonRepeatingCharacterFromString("tteecchhnnoo");
		

	}

}
