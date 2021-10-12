package precilla.assignment46;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*Write a program to remove duplicate from ArrayList (using set).
 * Make sure element order remain same.*/
public class Program4 {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(20);
		al.add(40);
		al.add(44);
		al.add(15);
		al.add(78);
		al.add(44);
		al.add(15);
		al.add(78);
		al.add(45);
		System.out.println("Input : "+al);
		Set<Integer> set=new LinkedHashSet<>(al);
		System.out.println("After removing duplicates : " +set);
	}

}
