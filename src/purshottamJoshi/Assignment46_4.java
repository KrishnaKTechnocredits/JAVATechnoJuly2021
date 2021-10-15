/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/
package purshottamJoshi;

import java.util.*;

public class Assignment46_4 {
	
	void removeDupliacteUsingSet(Integer[] arr) {
		
		ArrayList al = new ArrayList<>(Arrays.asList(arr));
		LinkedHashSet set = new LinkedHashSet(al);
		System.out.println(set);
	}

	public static void main(String[] args) {
		Integer[] arr = {1,2,5,3,4,3,2,7,8,9,6,7};
		new Assignment46_4().removeDupliacteUsingSet(arr);
	}
}
