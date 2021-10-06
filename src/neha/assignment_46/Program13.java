package neha.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.*/
public class Program13 {
	void traverseAlUsingEnhancedLoopAndIterator(ArrayList<String> al) {
		Iterator<String> itr = al.iterator();
		for (String name : al) {
			if (itr.hasNext())
				System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		Program13 program13 = new Program13();
		String[] names = { "Margi", "Bhakti", "Shraddha", "Amruta", "Indu", "Nidhi", "Monali" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));
		program13.traverseAlUsingEnhancedLoopAndIterator(al);
	}
}
