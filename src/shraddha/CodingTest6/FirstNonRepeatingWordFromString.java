/*Test - 6 : 10th Sep'2021
Program 2: Find first non repeating word from a given String. [expected : 15 mins]
input : hi this is techno gm credits this hi is 
output : techno
*/
package shraddha.CodingTest6;

import java.util.Arrays;

public class FirstNonRepeatingWordFromString {
	public static void main(String[] args) {
		String input = "hi this is techno gm credits this hi is";
		System.out.println("Given input is :- " + input);

		String nonRepeatWord = "";
		String[] inputArray = input.split(" ");
		System.out.println("array is " + Arrays.toString(inputArray));
		for (int index = 0; index < inputArray.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < inputArray.length; innerIndex++) {
				if (inputArray[index].equalsIgnoreCase(inputArray[innerIndex])) {
					nonRepeatWord = inputArray[index];
					count++;
				}
				if (count > 1)
					break;
			}
			if (count == 1)
				break;

		}
		System.out.println("Non repeating word in the above input is :- " + nonRepeatWord);
	}
}
