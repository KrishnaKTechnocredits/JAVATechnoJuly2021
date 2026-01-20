/* Assignment 46 - Collections : 4th Oct'2021
Example 2 : Write a program to find given number is duplicate in arrayList. */

package manaswi;

import java.util.ArrayList;

public class Assignment_46_Program_2 
{
	ArrayList<Integer> al = new ArrayList<Integer>();

	void findDuplicateNumberInArrayList(int num)
	{
		for(int index=0; index<al.size(); index++) 
		{
			if(al.indexOf(al.get(index)) != al.lastIndexOf(al.get(index)))
				{
				System.out.println(num + " is duplicate in array list " + al);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment_46_Program_2 p2 = new Assignment_46_Program_2();
		p2.al.add(5);
		p2.al.add(34);
		p2.al.add(11);
		p2.al.add(56);
		p2.al.add(74);
		p2.al.add(85);
		p2.al.add(11);
		p2.findDuplicateNumberInArrayList(11);
	}
}