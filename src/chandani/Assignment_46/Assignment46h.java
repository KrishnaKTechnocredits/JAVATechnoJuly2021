/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/
package chandani.Assignment_46;

import java.util.Arrays;
import java.util.LinkedList;

public class Assignment46h {
	
   public static void main(String[] args) {
		
		int[] arr = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Input : "+Arrays.toString(arr));
		for(int index=0;index<arr.length;index++) {
			if(arr[index]<0) {
				if(!list.contains(arr[index]))
					list.add(arr[index]);
			}

		}
		System.out.println("Output : "+ list);	
   }
}
   
