/*Example 15:
Write a program to convert Array to List.*/

package parthav.parthavD_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example15 {

	public static void main(String[] args) {
		Integer[] inputArr = {23, 56, 67, 34, 12, 89};
		List<Integer> list = new ArrayList<>(Arrays.asList(inputArr));
		System.out.println(list);
	}

}
