package dattaraj;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment46_P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment46_P16 pgm16 = new Assignment46_P16();
		HashSet<Integer> input = new HashSet<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		pgm16.traverseAHashSet(input);
	}

	private void traverseAHashSet(HashSet<Integer> input) {
		// TODO Auto-generated method stub
		Iterator<Integer> itr = input.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
