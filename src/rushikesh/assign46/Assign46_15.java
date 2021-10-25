package rushikesh.assign46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Write a program to traverse(or iterate) HashSet.

public class Assign46_15 {
	public static void main(String[] args) {

		String arr[] = {"techno", "credits", "java", "selenium", "automation"};
		Set<String> set = new HashSet<String>(Arrays.asList(arr));
		System.out.println("\nInput set :: " + set);
		System.out.println("\nElements of set printed using iterator :: ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");

	}
}
