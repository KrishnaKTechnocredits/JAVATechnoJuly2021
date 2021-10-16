package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]

 */
public class RemovingAllZerosFromList {
	//------------using raw logic-----------------
	int[] removingZeros(int[] num) {
		int j=0;
		for(int i=0; i<num.length; i++) {
			if(num[i]==0)
				j++;
		}
		int[] result = new int[num.length-j];
		for(int i=0, k=0; i<num.length; i++) {
			if(num[i]!=0) {
				result[k]=num[i];
				k++;
			}
		}
		return result;
	}
	//-------------using ArrayList collections--------------
	ArrayList<Integer> removingZerosV2(Integer [] num) {
		ArrayList<Integer> arl = new ArrayList<Integer>(Arrays.asList(num));
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int a : arl) {
			if(a!=0)
				result.add(a);
		}
		return result;
	}
		
	public static void main(String[] args) {
		int[] input = {10,0,0,1,0,3,0,2,6};
		System.out.println("-----Using raw logic.--------\n"+Arrays.toString(new RemovingAllZerosFromList().removingZeros(input)));
				
		Integer[] x = new Integer[input.length];
		for(int i=0; i<input.length; i++) {
			x[i]=input[i];
		}
		System.out.println("-----Using Integer class and collection logic.--------\n"+new RemovingAllZerosFromList().removingZerosV2(x));	
	}
}
