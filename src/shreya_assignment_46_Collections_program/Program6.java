
/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Program6 {

	public static void main(String[] args) {
		int[] arr = {12,52,44,54,87,36,12};
		System.out.println("Input : "+Arrays.toString(arr));
		TreeSet<Integer> set= new TreeSet<Integer>();
		for(int index=0;index<arr.length;index++) 
			set.add(arr[index]);
		ArrayList<Integer> list1 = new ArrayList<Integer>(set);
		System.out.println("Second largest number from the given array is :"+list1.get(list1.size()-2));

	}

}
