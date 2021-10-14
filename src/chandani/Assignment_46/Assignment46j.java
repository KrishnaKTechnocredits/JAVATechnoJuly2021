/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class Assignment46j {
	
	 public static void main(String[] args) {
			
			Integer[] arr = {1,6,2,5,7,6,3,10};
			
			LinkedHashSet<Integer> list = new LinkedHashSet<Integer>(Arrays.asList(arr));
			System.out.println("Input : "+Arrays.toString(arr));
			System.out.println("After removing duplicates using Linked Hash Set : " + list);
			
			ArrayList<Integer> output=new ArrayList<Integer>();
			
			for(int index = 1;index<=10;index++) {
					if(!list.contains(index))
						output.add(index);
				}
			
			System.out.println("\nOutput : " + output);	
		}
}
