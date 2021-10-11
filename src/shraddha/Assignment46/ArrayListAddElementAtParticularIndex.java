//Programming Questions - Collections : 4th Oct'2021
//Example 17:
//Write a program to add element at particular index of ArrayList?
//		
package shraddha.Assignment46;

import java.util.ArrayList;

public class ArrayListAddElementAtParticularIndex {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(19);
		al.add(12);
		al.add(18);
		al.add(17);
		al.add(23);
		al.add(22);
		System.out.println(al);
		al.add(2, 200);
		System.out.println("After adding new element at second index .. check the list .. " + al);
	}
}
