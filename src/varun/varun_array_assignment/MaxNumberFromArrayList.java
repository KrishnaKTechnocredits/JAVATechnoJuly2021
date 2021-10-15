/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
*/
package varun.varun_array_assignment;

import java.util.ArrayList;

public class MaxNumberFromArrayList {

	void maxNumberFromGivenArrayList(ArrayList<Integer> str) {
		int max = 0;
		for(int index=0;index<str.size();index++) {
			if(str.get(index)>max)
				max = str.get(index);
		}
		System.out.println("Maximum number from the given array list is " +max);
	}
	
	public static void main(String[] args) {
		MaxNumberFromArrayList maxNumberFromArrayList = new MaxNumberFromArrayList();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		maxNumberFromArrayList.maxNumberFromGivenArrayList(al);
	}
}
