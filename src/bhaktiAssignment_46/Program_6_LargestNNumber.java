/*
Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Program_6_LargestNNumber {
	
	static void nLaragestNumber(Integer[] input, int n) {
		TreeSet<Integer> numbers= new TreeSet(Arrays.asList(input));
		System.out.println(numbers);
		ArrayList output= new ArrayList (numbers); 
		System.out.println("Lagerst "+n+ " number is "+ output.get(output.size()-n));
		 
	}
	//with out collection 
	static void nLargeNumberWIthoutColl(int[] input, int n) {
		Arrays.sort(input);
		System.out.println("Without collection "+ input[input.length-n]);
	}
	
	public static void main(String[] args) {
		Integer[] input= {2,5,10,40,1,0};
		int[] input1={2,5,10,40,1,0};
		nLaragestNumber(input, 2);
		nLargeNumberWIthoutColl(input1, 2);
	
	}

}
 
