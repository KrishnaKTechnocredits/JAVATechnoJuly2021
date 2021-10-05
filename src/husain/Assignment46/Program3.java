/*
 * Example 3 :
Write a program to remove duplicate from ArrayList (without using set).
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 21, 12, 9, 43, 35, 12, 99, 21, 53));
		System.out.println(" Input List1 " + list1);

		for (int index = 0; index < list1.size(); index++)
			if (list1.indexOf(list1.get(index)) != list1.lastIndexOf(list1.get(index)))
				if (list1.indexOf(list1.get(index)) != index)
					list1.remove(index);
		
		System.out.println("Output list after removing duplicates "+ list1);
		
	}


}
