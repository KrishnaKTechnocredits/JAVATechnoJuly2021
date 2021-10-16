package gauravk.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 16:
Write a program to traverse(or iterate) HashSet.

 */
public class TraverseHashSet {
		
	public static void main(String[] args) {
		Integer[] numbers = {400,20,54,15,27,99,12,15,62,67,37,19,20,100,99};
		String[] strArray = {"Hi","Hello","Hi","Techno","Credits","Hi","Credits"};
		
		HashSet<String> hss = new HashSet<>(Arrays.asList(strArray));
		HashSet<Integer> hsInt = new HashSet<>(Arrays.asList(numbers));
		System.out.println(hss);
		System.out.println(hsInt);
		
		System.out.println("------traversing HashSet using iterator-------");
		Iterator itr = hss.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.print("\n");
		Iterator itrInt = hsInt.iterator();
		while(itrInt.hasNext()) {
			System.out.print(itrInt.next()+" ");
		}
		
		System.out.println("\n------traversing HashSet using Enhanced For loop-------");
		for(String name:hss) {
			System.out.print(name+" ");
		}
		System.out.print("\n");
		for(int n:hsInt) {
			System.out.print(n+" ");
		}
	}
}
