/*
 * Example 1 : 
Write a program to find given number is present in the arrayList or not.
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10, 21, 9, 43, 35, 12, 99, 53));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(5, 43, 19, 37, 21, 112, 9, 52));
		System.out.println("List1 " + list1);
		System.out.println("List2 " + list2);
		for(int num : list2)
			if(list1.contains(num))
				System.out.println("The given number "+num+" in List 2 is present in List1");
	}

}
