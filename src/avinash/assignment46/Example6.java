package avinash.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

public class Example6 {
	static void isRemoveSecondLargestNumber(Integer[] number) {
		
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(number));
		System.out.println(set);
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		list.remove(list.size()-2);
		System.out.println(list);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 1, 6, 2, 9, 3, 2, 4,1,9 };
		isRemoveSecondLargestNumber(input);

	}

}
