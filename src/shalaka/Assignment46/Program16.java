/*Example 16:
Write a program to traverse(or iterate) HashSet.*/
package shalaka.Assignment46;

import java.util.HashSet;
import java.util.Iterator;

public class Program16 {
	void traverseHashSet(HashSet<String> hs) {
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			String name = itr.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("shalaka");
		hs.add("mayur");
		hs.add("shashank");
		hs.add("shweta");
		hs.add("durva");
		hs.add("shalaka");
		Program16 program16 = new Program16();
		program16.traverseHashSet(hs);
	}

}
