/* Assignment 46 - Collections : 4th Oct'2021
Example 1 : Write a program to find given number is present in the arrayList or not. */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;

public class Program_1 {
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	void findNumberInArrayList(int num) {
		if(al.contains(num))
			System.out.println(num + " number is present in array list " + al);
		else
			System.out.println(num + " number is not present in array list " + al);
	}

	public static void main(String[] args) {
		Program_1 p1 = new Program_1();
		p1.al.add(7);
		p1.al.add(12);
		p1.al.add(22);
		p1.al.add(33);
		p1.al.add(65);
		p1.al.add(87);
		p1.al.add(43);
		p1.findNumberInArrayList(12);
	}
}