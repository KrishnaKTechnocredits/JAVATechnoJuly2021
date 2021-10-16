package precilla.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Example 15:
Write a program to convert Array to List.
*/
public class Program15 {
	public static void main(String[] args) {
		Integer[] arr= {10,45,6,59,88,77,99,66,55};
		System.out.println("Array : "+Arrays.toString(arr));
		List<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("output : "+al);
	}

}
