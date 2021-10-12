package precilla.assignment46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/*Example 16:
Write a program to traverse(or iterate) HashSet.
*/

public class Program16 {
	public static void main(String[] args) {
		Integer[] arr= {10,45,6,59,88,77,99,66,55};
		HashSet<Integer> hs=new HashSet<Integer>(Arrays.asList(arr));
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	
	}

}
