/*Example 16:
Write a program to traverse(or iterate) HashSet.
 */
package monika.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class Program_16 {
	
	void traverseHashset(HashSet<Integer> set) {
		Iterator<Integer> itr=set.iterator();
		System.out.println("Set printed using Iterator");
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
	}
	public static void main(String[] args) {
		Program_16 program_16=new Program_16();
		Integer[] number= {65,58,74,2,36,96,20,15};
		HashSet<Integer> hset=new HashSet<>(Arrays.asList(number));
		program_16.traverseHashset(hset);
	}

}
