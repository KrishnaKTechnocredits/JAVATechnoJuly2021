/* Assignment 46 - Collections : 4th Oct'2021
Example 2 : Write a program to find given number is duplicate in arrayList. */

package akanksha_Jain.Assignment_46;

import java.util.ArrayList;

public class Program_2 {
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	void findDuplicateNumberInArrayList(int num) {
		for(int index=0; index<al.size(); index++) {
			if(al.indexOf(al.get(index)) != al.lastIndexOf(al.get(index))) {
				System.out.println(num + " is duplicate in array list " + al);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Program_2 p2 = new Program_2();
		p2.al.add(7);
		p2.al.add(12);
		p2.al.add(22);
		p2.al.add(33);
		p2.al.add(65);
		p2.al.add(87);
		p2.al.add(33);
		p2.findDuplicateNumberInArrayList(33);
	}
}