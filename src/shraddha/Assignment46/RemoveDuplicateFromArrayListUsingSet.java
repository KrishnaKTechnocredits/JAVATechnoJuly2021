/*Programming Questions - Collections : 4th Oct'2021
Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.
*/
package shraddha.Assignment46;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArrayListUsingSet {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(53);
		al.add(72);
		al.add(10);
		al.add(72);
		System.out.println(al);
		LinkedHashSet<Integer> set = new LinkedHashSet<>(al);
		System.out.println(set);
	}
}
