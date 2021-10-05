package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;
import java.util.Iterator;

/*Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/
public class TraverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(1);
		listOfNumbers.add(6);
		listOfNumbers.add(2);
		listOfNumbers.add(5);
		listOfNumbers.add(7);
		listOfNumbers.add(6);
		listOfNumbers.add(3);
		listOfNumbers.add(10);
		
		System.out.println("Using iterator");
		Iterator<Integer> itr = listOfNumbers.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Using enhanced for loop");
		for(int num : listOfNumbers) {
			System.out.println(num);
		}
	}
}
