package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 8: 
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList

 */
public class ReturnListRemoveNegativeAndDuplicates {
	
	LinkedHashSet<Integer> removingNegativesAndDuplicates(Integer[] arr){
		List<Integer> arl = new ArrayList<Integer>();
		arl = Arrays.asList(arr);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for(Integer num : arl) {
			if(num>=0)
				lhs.add(num);
		}
		return lhs;
	}
	
	LinkedHashSet<Integer> returningAllNegativeNonDuplicates(Integer[] arr){
		List<Integer> arl = new ArrayList<Integer>();
		arl = Arrays.asList(arr);
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		for(Integer num : arl) {
			if(num<0)
				lhs.add(num);
		}
		return lhs;
	}
	
	public static void main(String[] args) {
		Integer [] input = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println("The list of positive and non-repeating numbers is : "+ new ReturnListRemoveNegativeAndDuplicates().removingNegativesAndDuplicates(input));
		System.out.println("The list of negative and non-repeating numbers is : "+ new ReturnListRemoveNegativeAndDuplicates().returningAllNegativeNonDuplicates(input));
	}
}
