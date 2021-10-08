/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method)*/
package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveObjectzFromArrayList_18 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(11,12,77,99,55,45,62));
		
		System.out.println("Input Array: " + alist);
		alist.remove(new Integer(18));
		alist.remove(new Integer(62));
		System.out.println("Removing Object from ArrayList by using remove(object) method:\n " + alist);
	}
}
