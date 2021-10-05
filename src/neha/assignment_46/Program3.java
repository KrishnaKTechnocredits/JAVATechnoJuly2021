package neha.assignment_46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).
*/
public class Program3 {
	ArrayList<Integer> al = new ArrayList<Integer>();

	void removeDuplicateUsingSet() {
		Set<Integer> setList = new HashSet<Integer>(al);
		System.out.println(setList);
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		program3.al.add(56);
		program3.al.add(2);
		program3.al.add(45);
		program3.al.add(56);
		program3.al.add(18);
		program3.al.add(29);
		program3.al.add(17);
		program3.al.add(76);
		program3.al.add(17);
		program3.removeDuplicateUsingSet();
	}
}