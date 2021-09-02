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
		System.out.println("");

	}

	public static void main(String[] args) {
		ReverseString newObject = new ReverseString();
		System.out.println("-----------------Program1---------------------");
		String inputString = "This is technocredits";
		System.out.println("The reversed string is: " + newObject.reverseGivenString(inputString));
		System.out.println("-----------------Program2---------------------");
		String[] inputArr = { "Credits", "Techno", "From", "Diwali", "Happy" };
		newObject.reverseStringArray(inputArr);

		VariableSwap newObject1 = new VariableSwap();
		System.out.println("-----------------Program3---------------------");
		System.out.println("Calling method to swap variables using 3rd variable");
		System.out.println("The passed values are 10, 15");
		newObject1.swapVariableUsingThirdVariable(10, 15);
		System.out.println("-----------------Program4---------------------");
		System.out.println("Calling method to swap variables without using 3rd variable");
		System.out.println("The passed values are  5, 8");
		newObject1.swapVariableWithoutThirdVariable(5, 8);

	}

}
