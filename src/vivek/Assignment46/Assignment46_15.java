/*Example 15:
Write a program to convert Array to List.*/

package vivek.Assignment46;

import java.util.Arrays;
import java.util.List;

public class Assignment46_15 {

	static void convertArrayToList(String[] arr) {
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
	}

	public static void main(String[] args) {
		String[] arr = { "vivek", "patil", "techno", "credits" };
		Assignment46_15.convertArrayToList(arr);
	}
}
