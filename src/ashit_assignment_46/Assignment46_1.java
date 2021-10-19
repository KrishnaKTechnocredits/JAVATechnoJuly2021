/*Example 1 : 
Write a program to find given number is present in the arrayList or not.
*/
/* Assignment 46 - Collections : 4th Oct'2021
Example 1 : Write a program to find given number is present in the arrayList or not. */

package ashit_assignment_46;

import java.util.ArrayList;

public class Assignment46_1
 {
	ArrayList<Integer> al = new ArrayList<Integer>();

	void findNumberInArrayList(int num) 
	{
		if(al.contains(num))
			System.out.println(num + " number is present in array list " + al);
		else
			System.out.println(num + " number is not present in array list " + al);
	}

	public static void main(String[] args)
	{
		Assignment46_1 p1 = new Assignment46_1();
		p1.al.add(5);
		p1.al.add(34);
		p1.al.add(11);
		p1.al.add(56);
		p1.al.add(74);
		p1.al.add(85);
		p1.al.add(98);
		p1.findNumberInArrayList(11);
	}
}