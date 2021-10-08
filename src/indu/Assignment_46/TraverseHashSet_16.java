/*Example 16:
Write a program to traverse(or iterate) HashSet.*/
package indu.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TraverseHashSet_16 {

	void iterateHashSet()
	{
		HashSet<Integer> hset = new HashSet<>(Arrays.asList(1,55,89,65,32,11));
		Iterator<Integer> itr = hset.iterator();
		System.out.println("Traverse hashset :\n");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
	
	public static void main(String[] args) {
		TraverseHashSet_16 a46_16 = new TraverseHashSet_16();
		a46_16.iterateHashSet();
	}
}
