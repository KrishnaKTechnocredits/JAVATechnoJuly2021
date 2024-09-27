package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator

public class TraverseArrayListUsingIterator {
	
	void getArrayListUsingEnhanceForLoop(ArrayList<Integer> num) {
		System.out.println("Iterate ArrayList Using enhance for loop");
		for(int number : num) {
			System.out.println(number);
		}
	}
	void getArrayListUsingIterator(ArrayList<Integer> num) {
		System.out.println("Iterate ArrayList Using Iterator");
		Iterator<Integer> itr=num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		TraverseArrayListUsingIterator traverseArrayListUsingIterator=new TraverseArrayListUsingIterator();
		Integer [] input= {2,4,6,8,5,33,66,78};
		List<Integer> list=Arrays.asList(input);
		ArrayList<Integer> al=new ArrayList<>(list);
		traverseArrayListUsingIterator.getArrayListUsingEnhanceForLoop(al);
		traverseArrayListUsingIterator.getArrayListUsingIterator(al);
	}
}
