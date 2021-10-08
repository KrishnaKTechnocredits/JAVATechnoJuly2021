/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/
package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46_17 {

	public static void main(String[] args) {
		int[] arr = {1,2,5,7,8,9};
		ArrayList al = new ArrayList(Arrays.asList(arr));
		al.add(94);
		al.remove(arr);
		System.out.println("After removing arr object : "+al);
	}
}
