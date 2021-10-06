/*
 * Example 2 :
Write a program to find given number is duplicate in arrayList.
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 21, 12, 9, 43, 35, 12, 99, 53));
		System.out.println("List1 " + list1);

		for (int index = 0; index < list1.size(); index++)
			if (list1.indexOf(list1.get(index)) != list1.lastIndexOf(list1.get(index)))
				if (list1.indexOf(list1.get(index)) != index)
					System.out.println("The given number " + list1.get(index) + " in List 1 is duplicate");
	}

}
