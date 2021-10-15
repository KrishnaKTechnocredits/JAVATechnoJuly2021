/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/


package ritabrata_Assignment_46;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment_46_14 {
	void traverseArray(ArrayList<Integer> input) {
		System.out.println("Traversing the arraylist via enhanced for loop: ");
		for (Integer num : input) {
			System.out.print(num+" ");
		}
		System.out.println("\nTraversing the arraylist via iterator: ");
		Iterator<Integer> itr = input.iterator();
		while (itr.hasNext())
			System.out.print(itr.next()+" ");
	}

	public static void main(String[] args) {
		Assignment_46_14 trav = new Assignment_46_14();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(19);
		input.add(12);
		input.add(50);
		input.add(17);
		input.add(23);
		input.add(70);
		trav.traverseArray(input);
	}

}
