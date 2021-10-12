package precilla.assignment46;
import java.util.Arrays;
import java.util.LinkedList;
//Example 9 : 
//Write a program to return Union of two ArrayList without duplicates.
public class Program9 {
	public static void main(String[] args) {
		Integer[] input1 = {10, 19, 33, 44, 12};
		Integer[] input2 = { 19, 99, 110, 11,10};
		System.out.println("input 1 : "+Arrays.toString(input1));
		System.out.println("input 2 : "+Arrays.toString(input2));
		LinkedList<Integer> al=new LinkedList<Integer>(Arrays.asList(input1));
		LinkedList<Integer> al1=new LinkedList<Integer>(Arrays.asList(input2));
		al1.removeAll(al);
		al.addAll(al1);
		System.out.println("Output : "+al);
	}

}
