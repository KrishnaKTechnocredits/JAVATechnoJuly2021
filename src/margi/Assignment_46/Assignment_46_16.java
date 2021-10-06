package margi.Assignment_46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//Write a program to traverse(or iterate) HashSet

public class Assignment_46_16 {

	void getIterate(HashSet<Integer> set) {
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		Assignment_46_16 assignment_46_16 = new Assignment_46_16();
		Integer[] num = { 19, 12, 18, 17, 23, 22 };
		HashSet<Integer> set = new HashSet<>(Arrays.asList(num));
		assignment_46_16.getIterate(set);
	}
}
