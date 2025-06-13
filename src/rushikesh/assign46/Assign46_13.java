package rushikesh.assign46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assign46_13 {

	//Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(19, 12, 18, 17, 23, 22));
		System.out.println("\nPrinting all elements in the list using enhanced for loop :: ");
		for(int num : list)
			System.out.print(num + " ");
		System.out.println("\n\nPrinting all elements in the list using iterator :: ");

		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + " ");


	}

}
