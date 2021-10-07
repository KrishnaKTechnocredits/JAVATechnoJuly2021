package swati.Assignment46;

/*
 * Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.
 */

import java.util.*;
public class Example11 {
	
	void findMissingNumber(Integer[] input,int start,int end) {
		List<Integer> inputList=new ArrayList<Integer>(Arrays.asList(input));
		List<Integer> output=new ArrayList<Integer>();
		for(int index=start;index<end;index++) {
			if(!inputList.contains(index)) {
				output.add(index);
				
			}
		}
		
		System.out.println(output);
	}

	public static void main(String[] a) {
		Example11 e1=new Example11();
		Integer[] input= {1,6,2,5,7,6,3,10};
		e1.findMissingNumber(input,1,10);
	}
}
