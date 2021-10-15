package swati.Assignment46;

import java.util.*;

/*
 * Example 15:
Write a program to convert Array to List.

Example 16:
Write a program to traverse(or iterate) HashSet.
 */

public class Example15_16 {
	
	public static void main(String[] a) {
		System.out.println("Convert Array to List\n");
		String[] arr1= {"swati","Sayee","techno","Credit"};
		List<String> list1=Arrays.asList(arr1);
		System.out.println(list1);
		
		HashSet<String> list2= new HashSet<String>(Arrays.asList(arr1)); 
		Iterator<String> itr=list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}

}

