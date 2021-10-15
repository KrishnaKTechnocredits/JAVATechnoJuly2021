package swati.Assignment46;

import java.util.*;

/*
 * Example 14:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
 */
public class Example14 {	
	void iterateLoop(Integer[] input) {
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(input));
		System.out.println("Using Enhanced for loop");
		for(int num:list1) {
			System.out.println(num);
		}
		System.out.println("Using Iterator");
		Iterator <Integer> itr1= list1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}		
	}
		
	public static void main(String[] a) {
		Example14 e1=new Example14();
		Integer[] input= {10,20,11,15};
		e1.iterateLoop(input);		
	}

}
