/*
 * Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 21, 12, 9, 43, 35, 12, 99, 21, 53));
		System.out.println("Input List1 " + list1);
		Set<Integer> set = new LinkedHashSet<Integer>(list1);
		list1.removeAll(set);
		list1.addAll(set);
		System.out.println("Output list with duplicates removed " + list1);

	}

}
