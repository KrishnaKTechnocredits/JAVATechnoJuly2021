package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.

 */
public class TraverseArrayList {
	
	void traverseUsingAdvancedForLoop(Integer[] num) {
		ArrayList<Integer> arl = new ArrayList<>(Arrays.asList(num));
		System.out.println("----------using Advanced For Loop---------");
		for(int i:arl) {
			System.out.print(i);
		}
		System.out.println("\n"+arl);
	}
	
	void traverseUsingIterator(Integer[] num) {
		ArrayList<Integer> arl = new ArrayList<>(Arrays.asList(num));
		System.out.println("\n----------using Iterator---------");
		Iterator itr = arl.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next());
		}
		System.out.println("\n"+arl);
	}
	
	public static void main(String[] args) {
		Integer[] numbers = {400,20,54,15,27,99,12,15,62,67,37,19,20,100,99};
		TraverseArrayList ta = new TraverseArrayList();
		ta.traverseUsingAdvancedForLoop(numbers);
		ta.traverseUsingIterator(numbers);
	}
}
