/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/
package neha.assignment_46;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program4 {
	ArrayList<Integer> al = new ArrayList<Integer>();

	void removeDuplicateUsingSetWithInsertionOrder() {
		Set<Integer> setList = new LinkedHashSet<Integer>(al);
		System.out.println("ArrayList " + al + " after removal of duplicates using set is " + setList);
	}

	public static void main(String[] args) {
		Program4 program4 = new Program4();
		program4.al.add(56);
		program4.al.add(2);
		program4.al.add(45);
		program4.al.add(56);
		program4.al.add(18);
		program4.al.add(29);
		program4.al.add(17);
		program4.al.add(76);
		program4.al.add(17);
		program4.removeDuplicateUsingSetWithInsertionOrder();
	}
}
