/*Example 16:
Write a program to traverse(or iterate) HashSet.*/
package purshottamJoshi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment46_15 {

	public static void main(String[] args) {
	
		Set <Integer>set = new HashSet<>();
		set.add(1);
		set.add(5);
		set.add(9);
		set.add(10);
		System.out.println("Iterate Using Enhanced For Loop");
		for(Integer a : set) {
			System.out.println(a);
		}
		System.out.println("Iterate Using Iterator Loop");
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
