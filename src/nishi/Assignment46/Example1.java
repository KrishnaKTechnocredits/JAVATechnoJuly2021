/*Example 1 : 
Write a program to find given number is present in the arrayList or not.
*/
package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) {
		Integer[] arr = { 11, 12, 13, 44, 55 };
		Integer num = 55;
		Integer num2 = 65;
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		new Example1().checkNo(al, num);
		new Example1().checkNo(al, num2);

	}

	private void checkNo(ArrayList<Integer> al, int num) {
		for (Integer a : al) {
			if (al.contains(num)) {
				System.out.println(num + " number is present ");
				break;
			} else {
				System.out.println(num + " number is not present");
				break;
			}
		}
	}
}
