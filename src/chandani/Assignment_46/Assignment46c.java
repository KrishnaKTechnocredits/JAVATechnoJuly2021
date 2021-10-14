/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/
package chandani.Assignment_46;

import java.util.ArrayList;

public class Assignment46c {
	
	void getUniqueNumbers(ArrayList<Integer> list) {
		for (int index = 0; index < list.size(); index++) {
			if (list.indexOf(list.get(index)) != list.lastIndexOf(list.get(index))) {
				list.remove(list.get(index));
			}
		}
		System.out.println("Arraylist after removing duplicates: " + list);	
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
		    	
		    	Assignment46c assignment46c = new Assignment46c();
		    	assignment46c.getUniqueNumbers(arr);
		
		
	}

}
