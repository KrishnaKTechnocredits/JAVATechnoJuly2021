package avinash.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Example 13:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/


public class Example13 {
	
	static void traverseArrayListUsingLoop(ArrayList<Integer> list) {
		for(int num: list) {
			System.out.print(num+" ");
		}
	}
	
	static void traverseArrayListUsinIterator(ArrayList<Integer> list) {
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = {19, 12, 18, 17, 23, 22};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));
		traverseArrayListUsingLoop(arrayList);
		System.out.println();
		System.out.println("-------------------");
		traverseArrayListUsinIterator(arrayList);
	}

}
