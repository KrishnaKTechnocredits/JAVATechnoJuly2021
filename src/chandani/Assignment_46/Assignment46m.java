/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assignment46m {
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		for (Integer num : arr) {
			System.out.print(" " + num);
		}
		
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext()) {
				itr.next();
		}
		System.out.println("\nOutput : " + list);
	 }

}
