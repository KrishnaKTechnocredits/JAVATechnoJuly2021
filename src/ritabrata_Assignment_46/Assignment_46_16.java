/*Example 16:
Write a program to traverse(or iterate) HashSet.*/


package ritabrata_Assignment_46;
import java.util.HashSet;
import java.util.Iterator;
public class Assignment_46_16 {
	void travHashSet(HashSet<Integer> input) {
		Iterator<Integer> itr = input.iterator();
		System.out.println("The output is: ");
		while (itr.hasNext())
			System.out.print(itr.next()+" ");
	}

	public static void main(String[] args) {
		Assignment_46_16 hash = new Assignment_46_16();
		HashSet<Integer> input = new HashSet<Integer>();
		input.add(19);
		input.add(12);
		input.add(18);
		input.add(17);
		input.add(23);
		input.add(22);
		hash.travHashSet(input);
	}

}
