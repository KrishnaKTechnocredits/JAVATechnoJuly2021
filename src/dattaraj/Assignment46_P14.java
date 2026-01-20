package dattaraj;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment46_P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P14 pgm14 = new Assignment46_P14();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		pgm14.traverseAnArrayList(input);
	}

	private void traverseAnArrayList(ArrayList<Integer> input) {
		// TODO Auto-generated method stub
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

}
