package precilla.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/
public class Program6 {
	public static void main(String[] args) {
		Integer arr[]= {10,4,5,66,88,99,45,104,105,103};
		System.out.println("input "+Arrays.toString(arr));
		TreeSet<Integer> ts=new TreeSet<Integer>(Arrays.asList(arr));
		List<Integer> al=new ArrayList<>(ts);
		System.out.println("Second Largest Element "+al.get(al.size()-2));
	}
}

