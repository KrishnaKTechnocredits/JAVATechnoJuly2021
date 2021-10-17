package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to remove duplicate from ArrayList (without using set).

public class RemoveDuplicateFromArrayListWithoutUsingSet {
	
	void removeDuplicates(ArrayList<Integer> num) {
		ArrayList<Integer> al1=new ArrayList<>();
		for(int index=0;index < num.size();index ++) {
			if(!al1.contains(num.get(index))) {
				al1.add(num.get(index));
			}
		}
		System.out.println(al1);
	}
	public static void main(String[] args) {
		RemoveDuplicateFromArrayListWithoutUsingSet removeDuplicateFromArrayListWithoutUsingSet = new RemoveDuplicateFromArrayListWithoutUsingSet();
		Integer [] input= {2,3,4,3,5,6,4,78,0,54,3};
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(input));
		removeDuplicateFromArrayListWithoutUsingSet.removeDuplicates(al);
	}

}
