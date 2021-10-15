/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]
Output: output : [10,19,33,44,12,99,110,11]
*/

package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Program_9_UnionWithoutDUplicates {
	
	static void unionOfTwolistWithoutDUplicates(Integer[] input1, Integer[] input2) {
		 ArrayList<Integer> ar1= new ArrayList(Arrays.asList(input1));
		 ArrayList<Integer> ar2= new ArrayList(Arrays.asList(input2));
		 
		 ArrayList output= new ArrayList();
		 for (int n: ar1) {
			 if (!output.contains(n))
				 output.add(n);
		 }
		 for (int n: ar2) {
			 if (!output.contains(n))
				 output.add(n);
		 }
		 System.out.println(output);
	}
	
	//method 2 
	static void unionOfTwolistWithoutDUplicates2(Integer[] input1, Integer[] input2) {
		 ArrayList<Integer> ar1= new ArrayList(Arrays.asList(input1));
		 ArrayList<Integer> ar2= new ArrayList(Arrays.asList(input2));
		 ar1.removeAll(ar2);
		 ar1.addAll(ar2);
		 System.out.println(ar1);
	} 
	//Method 3 by using HashSet 
	static void unionOfTwolistWithoutDUplicatesWithSet(Integer[] input1, Integer[] input2) {
		 HashSet<Integer> ar1= new HashSet(Arrays.asList(input1));
		 HashSet<Integer> ar2= new HashSet(Arrays.asList(input2));
		  
		 ar1.addAll(ar2);
		 System.out.println(ar1);
	}
	
	public static void main(String[] args) {
	 Integer[] input1 = {10, 19, 33, 44, 12};
	 Integer[] input2= {19, 99, 110, 11,10};
	 unionOfTwolistWithoutDUplicates(input1, input2);
	 unionOfTwolistWithoutDUplicates2(input1, input2);	
	 unionOfTwolistWithoutDUplicatesWithSet(input1, input2);	
	}

}

