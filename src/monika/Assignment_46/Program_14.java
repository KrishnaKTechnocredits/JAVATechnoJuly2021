/*Example 14:
 Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
 */
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Program_14 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(20,25,78,45,69,10,60));
		System.out.println("Using Enhanced For Loop");
		for(int number:al)
			System.out.print(number+ " ");
		System.out.println("\n-------------------------");
		System.out.println("Using Iterator");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		
	}
}
