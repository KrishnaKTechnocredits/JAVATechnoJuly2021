/*Programming Questions - Collections : 4th Oct'2021
Example 15:
Write a program to convert Array to List.*/
package shraddha.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
	public static void main(String[] args) {
		Integer[] intArr = { 10, 11, 13, 15, 16, 19, 33, 77, 89 };
		System.out.println("I have taken Int array as :- " + Arrays.toString(intArr));
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(intArr));
		System.out.println("Now I have converted this array to List :- " + al);
	}
}
