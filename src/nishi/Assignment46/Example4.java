/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Example4 {
	public static void main(String[] args) {
		Integer[] arr = { 11, 12, 13, 44, 55,55 };		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
		TreeSet<Integer> a1=new Example4().removeDuplicate(al);
		System.out.println(a1);
	}

	private TreeSet<Integer> removeDuplicate(ArrayList<Integer> al) {
		TreeSet<Integer> ts = new TreeSet<Integer>(al);
		for (int index=0;index<al.size();index++) {			
				ts.add(al.get(index));			
		}
		return ts;
	}
}
