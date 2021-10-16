/*Example 6 :
Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Assignment46f {
	
	public static void main(String[] args) {
		
		int[] arr = {10,90,60,50,40,80,15};
		
		System.out.println("Input : "+Arrays.toString(arr));
		
		TreeSet<Integer> set= new TreeSet<Integer>();
	    for(int index=0;index<arr.length;index++) 
			set.add(arr[index]);
		ArrayList<Integer> list1 = new ArrayList<Integer>(set);
		System.out.println("Second largest number from the given array is " +list1.get(list1.size()-2));

	}
}
