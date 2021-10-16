/* Programming Questions - Collections : 4th Oct'2021
* Example 17:
Write a program to add element at particular index of ArrayList?*/

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example17 {

	public static void main(String[] args) {
		Integer[] inputArr = {23, 56, 80, 95, 100};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(inputArr));
		list.add(1, 99);
		System.out.println(list);

	}

}
