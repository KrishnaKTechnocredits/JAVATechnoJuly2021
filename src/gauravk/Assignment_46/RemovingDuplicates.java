package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 3 :
Write a program to remove duplicate from ArrayList (without using set).

Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.
 */
public class RemovingDuplicates {
	
	void removingDuplicatesWithoutSet(Integer[] arr) {
		ArrayList<Integer> arl = (ArrayList<Integer>)new ArrayList<>(Arrays.asList(arr));
		for(int i=0; i<arl.size(); i++) {
			int x = arl.get(i);
			if(arl.indexOf(x)!=arl.lastIndexOf(x)) {
				arl.remove(arl.lastIndexOf(x));
				i--;
			}
		}
		System.out.println("---Output of Program:3 ----Removing duplicates without using 'Set'---------");
			System.out.println(arl);
	}
	
	void removingDuplicatesUsingSet(Integer[] arr) {
		ArrayList<Integer> arl = (ArrayList<Integer>)new ArrayList<>(Arrays.asList(arr));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(arl);
		
		System.out.println("---Output of Program:4 ----Removing duplicates using 'Set'---------");
			System.out.println(lhs);
	}
	
	public static void main(String[] args) {
		Integer[] a = {12,15,88,46,79,99,1000,588,49,344,167,1000,46,97,22,5,46,14,6,49,3,77,11,99,100};
		System.out.println("Number set : "+Arrays.toString(a));
		new RemovingDuplicates().removingDuplicatesWithoutSet(a);
		new RemovingDuplicates().removingDuplicatesUsingSet(a);
	}
}
