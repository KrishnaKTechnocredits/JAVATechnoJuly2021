package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 13:
Remove all non prime numbers from given Set.

input : [19,12,18,17,23,22]
output : [19,17,23]

 */
public class RemovingAllNonPrimeNums {
	
	void removeNonPrimeNums(int[] num) {
		Integer[] numbers = new Integer[num.length];
		for(int i=0; i<num.length; i++) {
			numbers[i]=num[i];
		}
		Vector<Integer> arl = new Vector<Integer>(Arrays.asList(numbers));
		Vector<Integer> result = new Vector<Integer>();
		
		for(int x: arl) {
			int j=0;
			for(int i=2; i<x; i++) {
				if(x%i==0) {
					j++;
					break;
				}		
			}
			if(j==0)
				result.add(x);
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int [] numbers = {19,12,18,17,23,22};
		new RemovingAllNonPrimeNums().removeNonPrimeNums(numbers);
	}
}
