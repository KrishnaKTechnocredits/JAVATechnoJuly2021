/*
 *Example 16:
Write a program to traverse(or iterate) HashSet.
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"techno", "credits", "java", "selenium", "automation"};
		Set<String> set = new HashSet<String>(Arrays.asList(arr));
		System.out.println("Input set " + set);
		System.out.println("\nElements of set printed using iterator ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");

	}

}
