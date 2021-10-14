/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/
package chandani.Assignment_46;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Assignment46d {


	public void getUniqueNumbersUsingSet(ArrayList<Integer> list) {
	 LinkedHashSet<Integer> list1 = new LinkedHashSet<>(list);
	 System.out.println("Array list after removing suplcates using set " + list1);
	}
	
	public static void main(String[] args) {
		
		  ArrayList<Integer> arr = new ArrayList<Integer>();

		    // using add() to initialize values
		    // [1, 2, 3, 4]
		    	arr.add(1);
		    	arr.add(2);
		    	arr.add(3);
		    	arr.add(4);
		    	arr.add(3);
		    	arr.add(2);
		    	
		    	Assignment46d assignment46d = new Assignment46d();
		    	assignment46d.getUniqueNumbersUsingSet(arr);
			
	}
}
