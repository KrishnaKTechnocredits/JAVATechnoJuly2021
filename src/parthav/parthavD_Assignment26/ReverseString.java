//Assignment - 26 WAP to print Reverse a given String. 
//input : This is technocredits
//output : stiderconhcet si sihT  

package parthav.parthavD_Assignment26;

public class ReverseString {

	String reverseGivenString(String inputStr) {
		String reversedString = "";

		for (int index = inputStr.length() - 1; index >= 0; index--) {
			reversedString += inputStr.charAt(index);
		}

		return reversedString;

	}

	void reverseStringArray(String[] inputStrArray) {
		String[] reversedStrArray = new String[inputStrArray.length];
		int reverseIndex = 0;
		for (int index = inputStrArray.length - 1; index >= 0; index--) {
			reversedStrArray[reverseIndex] = inputStrArray[index];
			reverseIndex++;
		}

		System.out.print("The reversed string array is:  {");
		for (int index = 0; index < reversedStrArray.length; index++) {
			System.out.print(reversedStrArray[index] + ",");
		}
		System.out.print("}");

	}

	public static void main(String[] args) {
		ReverseString newObject = new ReverseString();
		String inputString = "This is technocredits";
		System.out.println("The reversed string is: " + newObject.reverseGivenString(inputString));
		String[] inputArr = { "Credits", "Techno", "From", "Diwali", "Happy" };
		newObject.reverseStringArray(inputArr);

	}

}
