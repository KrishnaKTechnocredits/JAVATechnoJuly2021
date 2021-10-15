/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Example6 {
	public static void main(String[] args) {
		Integer[] arr = { 12, 11, 90, 44, 55 };	
		System.out.println("Input :"+Arrays.toString(arr));
		int num=new Example6().findSecondLargest(arr);
		System.out.println("Second largest number is "+num);

	}

	private int findSecondLargest(Integer[] arr) {
		Set<Integer> set=new TreeSet<Integer>(Arrays.asList(arr));
		ArrayList<Integer> al=new ArrayList<Integer>(set);		
		return al.get(al.size()-2);
	}
}
