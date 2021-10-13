
/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/

package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Program14 {

	public static void main(String[] args) {
		Integer[] arr= {5,11,24,23,69};
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("Arraylist using enhanced for loop ");
		for(int num:list1)
			System.out.print(num + " ");
		
		System.out.println("\nArrayList using iterator ");
		Iterator<Integer> itr =list1.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		}

}
