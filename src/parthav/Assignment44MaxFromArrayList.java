/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/

package parthav;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment44MaxFromArrayList {

	void printMaxNumberFromArrayList(Integer[] input) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		int maxNumber = 0;
		for (int number : al) {
			if (maxNumber < number)
				maxNumber = number;
		}

		System.out.println(maxNumber);
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 7, 99, 53, 74 };
		Assignment44MaxFromArrayList newObj = new Assignment44MaxFromArrayList();
		newObj.printMaxNumberFromArrayList(input);

	}

}
