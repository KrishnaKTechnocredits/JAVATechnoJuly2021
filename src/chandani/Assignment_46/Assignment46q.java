/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment46q {
	
	void removeObject(ArrayList<Integer> list, Integer element) {
		list.remove(element);
		System.out.println(list);
	}

	public static void main(String[] args) {
		Assignment46q assignment46q = new Assignment46q();
		Integer[] input = { 21, 22, 18, 3, 12, 23 };
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(input));
		System.out.println(list);
		System.out.println("After removing one integer object " );
		assignment46q.removeObject(list,23);
	}
}
