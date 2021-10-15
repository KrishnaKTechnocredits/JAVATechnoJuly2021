/*Example 15:
Write a program to traverse(or iterate) HashSet.*/

package amol_Pawar.assignment_46;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program_15 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet();
		set.add("Amol");
		set.add("sanket");
		set.add("Rakesh");
		
		Iterator<String> itr=set.iterator();
		System.out.println("Iterating set using iterator ");
		while(itr.hasNext())
		{
			String name= itr.next();
			System.out.print(name+" ");
		}

	}

}
