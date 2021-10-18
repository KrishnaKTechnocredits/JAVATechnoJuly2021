/*Example 1 : 
Write a program to find given number is present in the arrayList or not.
*/
package bhagyashree.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_1 {

	static void isNumberPresent(ArrayList<Integer> al, int num) {
		if (al.contains(num)) {
			System.out.println(num + "  Given number is present in ArrayList");
		} else
			System.out.println(num + "   Given number is not present in ArrayList");

	}

	public static void main(String[] args) {
		// Assignment46_1 ass46=new Assignment46_1();
		Integer[] arrList = { 5, 89, 56, 74, 3, 6, 8, 96 };
		ArrayList<Integer> all = new ArrayList<Integer>(Arrays.asList(arrList));
		isNumberPresent(all, 74);

		isNumberPresent(all, 99);
	}

}
