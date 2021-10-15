/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
*/
package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Example14 {
	public static void main(String[] args) {
		String[] arr= {"Ankita","Ram","Priya","Nandini"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Traversing ArrayList using enhanced for loop :");
		for(String name:al)
		{
			System.out.print(name +",");
		}
		System.out.println();
		System.out.println("Traversing using Iterator :");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
	}
}
