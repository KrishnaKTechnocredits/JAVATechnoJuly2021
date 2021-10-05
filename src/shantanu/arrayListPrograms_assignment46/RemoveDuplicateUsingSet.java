package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;
import java.util.LinkedHashSet;
/*Write a program to remove duplicate from ArrayList (using set).*/
public class RemoveDuplicateUsingSet {
	LinkedHashSet<Integer> modifyList(ArrayList<Integer>listOfNumbers){
		LinkedHashSet<Integer> noDuplicates = new LinkedHashSet<Integer>(listOfNumbers);
		return noDuplicates;
	}
	public static void main(String[] args) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(1);
		listOfNumbers.add(2);
		listOfNumbers.add(3);
		listOfNumbers.add(4);
		listOfNumbers.add(3);
		listOfNumbers.add(2);
		
		RemoveDuplicateUsingSet removeDuplicateUsingSet = new RemoveDuplicateUsingSet();
		System.out.println("List after removing duplicates");
		System.out.println(removeDuplicateUsingSet.modifyList(listOfNumbers));
	}
}
