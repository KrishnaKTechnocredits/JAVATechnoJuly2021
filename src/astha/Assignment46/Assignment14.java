//Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator

package astha.Assignment46;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment14 {

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
		Assignment14 assignment14 = new Assignment14();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		assignment14.traverseAnArrayList(input);
	}
}
