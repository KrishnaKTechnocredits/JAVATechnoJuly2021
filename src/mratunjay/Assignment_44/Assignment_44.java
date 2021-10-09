package mratunjay.Assignment_44;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

// Find maximum number from an ArrayList

public class Assignment_44 {	

	int findTheMaxiumNumber(ArrayList<Integer>  al) {
		int max = 0 ;
		for(int index =0; index< al.size(); index++) {
			
			if (al.get(index) > max)
				max = al.get(index);
			
		}
		return max;
		
	}
	
	int findTheMaxiumNumberForLoop(ArrayList<Integer>  al) {
		int max = 0;
		
		for(int element : al) {
			
			if (element > max )
				max = element;
			
			
		}
		
		return max;
	}
	
	
public static void main(String[] args) {
		Integer arr [] = {10, 25, 35, 65, 84, 80, 10};
		Assignment_44 A_44 = new Assignment_44();
		
		ArrayList<Integer> numberlist = new ArrayList<Integer>();
		
		numberlist.add(10);
		numberlist.add(20);
		numberlist.add(20);
		numberlist.add(35);
		numberlist.add(6);
		numberlist.add(24);
		numberlist.add(24);
		System.out.println("Array List: " +numberlist);
		System.out.println("Maximum number from ArrayList:   " +A_44.findTheMaxiumNumber(numberlist));
		System.out.println("Maximum number from ArrayList:   " +A_44.findTheMaxiumNumberForLoop(numberlist));
		
	
		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(arr)); // to get numbers in natural increasing order
		
		System.out.println("Array List after removing duplicate value: " +ts);
	}

}
