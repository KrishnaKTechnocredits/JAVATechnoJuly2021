/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/

package purshottamJoshi;

import java.util.*;

public class Assignment46_13 {

	void displayArrayList(Integer[] input) {
		
		ArrayList<Integer> al = new ArrayList(Arrays.asList(input));
		System.out.println("Traverse Using Enhanced For Loop : ");
		for(Integer a : al) {
			if(a >4)
			System.out.println(a);
		}
		System.out.println("Traverse Using Iterator :");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	public static void main(String[] args) {
		Integer[] input = {12,10,4,5,8,9};	
		new Assignment46_13().displayArrayList(input);
	}
}
