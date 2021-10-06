/*
 *Example 12 :
Remove all zeros from given ArrayList.
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]

 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 0, 0, 1, 0, 3, 0, 2, 6));
		System.out.println("List 1" + list1);
		for (int index = 0; index < list1.size(); index++)
			if (list1.get(index).equals(0)) {
				list1.remove(index);
				index--;
			}

		System.out.println("Output list containing numbers without 0 in list1 " + list1);

	}

}
