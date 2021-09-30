/*
 Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
output : 15
         3
 */
package umakant;

public class Assignment40 {

	void printNumbersInString(String input) {
		String[] inputArray = input.split(" ");
		for (int index = 0; index < inputArray.length; index++) {
			try {
				System.out.println(Integer.parseInt(inputArray[index]));
			} catch (NumberFormatException nfe) {
				// using catch block so that program does not terminate..
			}
		}
	}

	public static void main(String[] args) {
		new Assignment40().printNumbersInString("I have 5 years and 3 months of exp");
	}

}
