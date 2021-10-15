/*Example 13:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program_13 {

	public static void main(String[] args) {
		Integer arr[]= {3,4,3,5,6,7,9,03,3};
		List<Integer> list=new ArrayList(Arrays.asList(arr));
		System.out.print("Array printing with Enhance For loop : ");
		for(int num:list)
		{
			System.out.print(num+" ");
		}
		
		Iterator<Integer> itr=list.iterator();
		System.out.println();
		System.out.print("Array printing with iterator : ");
		while(itr.hasNext())
		{
		
			System.out.print(itr.next()+" ");
		}

	}

}
