package monali.Assignment_46;
/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program6 {
	public static void main(String[] args) {
		Integer arr[] = { 10, 40, 50, 20, 60, 177, 55, 66, 88, 99 };
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println(set);
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list.get(list.size() - 2));
	}

}
