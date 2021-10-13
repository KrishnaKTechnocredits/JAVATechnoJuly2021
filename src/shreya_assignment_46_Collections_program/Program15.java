
/*Example 15:
Write a program to convert Array to List.*/

package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program15 {

	public static void main(String[] args) {
		String[] arr = {"Divya","Prajakta","Rashmi","Sonali","Priyal"};
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Converting Array to List: ");
		System.out.println(list1);
	}

}
