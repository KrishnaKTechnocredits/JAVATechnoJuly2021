/* Programming Questions - Collections : 4th Oct'2021
* Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example18 {

	public static void main(String[] args) {
		Integer[] inputArr = { 23, 56, 80, 95, 100 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(inputArr));
		boolean removedObject = list.remove(new Integer(80));
		System.out.println("Was the object removed? The answer is: " + removedObject);
		System.out.println(list);

	}

}
