
/*Example 16:
Write a program to traverse(or iterate) HashSet.*/
package shreya_assignment_46_Collections_program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Program16 {
	void traverseHashSet(HashSet<Integer> input) {
		Iterator<Integer> itr = input.iterator();
		System.out.println("After Traversing a HashSet : ");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
			
			
	}
	public static void main(String[] args) {
		Program16 program16= new Program16();
		HashSet<Integer> list1=new HashSet<Integer>(Arrays.asList(15,5,65,23,4));
		program16.traverseHashSet(list1);

	}

}
