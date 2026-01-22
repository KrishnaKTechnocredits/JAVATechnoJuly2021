/*Assignment – 43 : 31st Sep’2021
Find length of a string without using length as a property or method
*/

package parthav;

import java.util.ArrayList;
import java.util.List;

public class Assignment43 {

	void printLengthOfStringUsingExceptions(String str) {
		int index = 0;
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
		new Assignment43().printLengthOfStringUsingExceptions("Character");
		new Assignment43().printLengthOfStringUsingExceptions("TechnoCredits");

	}

}
