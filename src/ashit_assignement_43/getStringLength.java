/*Assignment – 43 : 31st Sep’2021
Find length of a string without using length as a property or method
*/

package ashit_assignement_43;

public class getStringLength {

	void printLengthOfStringUsingExceptions(String str) {
		int index = 0;
		
		@SuppressWarnings("unused")
		char ch;
		while (true) {
			try {
				ch = str.charAt(index);
			} catch (StringIndexOutOfBoundsException ne) {
				break;
			}
			index++;
		}
		System.out.println("The length of the string: " + str + " is: " + index);

	}

	public static void main(String[] args) {
		new getStringLength().printLengthOfStringUsingExceptions("Character");
		new getStringLength().printLengthOfStringUsingExceptions("TechnoCredits");

	}

}
