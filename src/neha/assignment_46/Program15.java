package neha.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*Example 16:
Write a program to traverse(or iterate) HashSet.*/
public class Program15 {
	void traverseHashSet(String[] names) {
		HashSet<String> hs = new HashSet<String>(Arrays.asList(names));
		System.out.println("Iterate HashSet using iterator");
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\r\nIterate HashSet after conversion to array list");
		ArrayList<String> al = new ArrayList<String>(hs);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

	public static void main(String[] args) {
		Program15 program15 = new Program15();
		String[] nameList = { "Parth", "Anand", "Malhar", "Om", "Raj" };
		program15.traverseHashSet(nameList);

	}
}
