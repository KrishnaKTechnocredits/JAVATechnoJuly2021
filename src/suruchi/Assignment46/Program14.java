//Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.

package suruchi.Assignment46;

import java.util.ArrayList;
import java.util.Iterator;

public class Program14 {

	void traverseAnArrayList(ArrayList<Integer> input) {
		System.out.println("Traversing the arraylist via enhanced for loop");
		for (Integer num : input) {
			System.out.println(num);
		}
		System.out.println("\n");
		System.out.println("Traversing the arraylist via iterator");
		Iterator<Integer> itr = input.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

	public static void main(String[] args) {
		Program14 program14 = new Program14();

		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		
		System.out.println("Arraylist is: " + input);
		System.out.println();
		program14.traverseAnArrayList(input);
	}
}