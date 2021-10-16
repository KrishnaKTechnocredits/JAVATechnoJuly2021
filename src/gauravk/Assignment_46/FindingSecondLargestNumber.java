package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList

 */
public class FindingSecondLargestNumber {
	
	void findSecondLargest(Integer [] num) {
		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(num));
		ArrayList<Integer> arl = new ArrayList<Integer>(ts);
		arl.remove(arl.size()-2);
		System.out.println(arl);
	}
	
	public static void main(String args[]) {
		Integer [] input = {10,55,42,5,73,101,52,14,17,19,17};
		new FindingSecondLargestNumber().findSecondLargest(input);
	}
}
