package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

public class RemoveDuplicateFromArrayListUsingSet {
	
	void removeDuplicate(ArrayList<Integer> num) {
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		for(int index = 0 ;index < num.size();index++) {
			if(!set.contains(num.get(index))) {
				set.add(num.get(index));
			}
		}
		System.out.println(set);
	}
	public static void main(String[] args) {
		RemoveDuplicateFromArrayListUsingSet removeDuplicateFromArrayListUsingSet = new RemoveDuplicateFromArrayListUsingSet();
		Integer [] input= {2,3,4,3,5,6,4,78,54,3};
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(input));
		//Set<Integer> set= new LinkedHashSet<>(al);
		removeDuplicateFromArrayListUsingSet.removeDuplicate(al);
		
	}
}
