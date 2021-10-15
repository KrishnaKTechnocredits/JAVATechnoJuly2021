package swati.Assignment46;

import java.util.*;
/*
 * Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]
 */

public class Example12 {
	
	void removeAllZerosFromList(Integer[] input) {
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int num:list1) {
			if(num!=0) {
				output.add(num);
			}
		}		
		System.out.println(output);
	}
	
	public static void main(String[] a) {
		Example12 e1=new Example12();
		Integer[] input= {10,0,0,1,0,3,0,2,6};
		e1.removeAllZerosFromList(input);
	}

}

