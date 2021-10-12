package precilla.assignment46;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
//Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator.
public class Program14 {
	public static void main(String[] args) {
		Integer arr[]= {19,12,18,17,23,22};
		LinkedList<Integer> al=new LinkedList<Integer>(Arrays.asList(arr));
		System.out.println("Traverse through enhanced for loop");
		for(int data:al) {
			if(data!=al.get(al.size()-1))
				System.out.print(data+",");
			else
				System.out.print(data);
		}
		System.out.println("\nTraversing through iterator");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
