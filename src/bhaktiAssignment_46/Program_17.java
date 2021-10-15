/*Example 17:
Write a program to add element at particular index of ArrayList?*/

package bhaktiAssignment_46;

import java.util.ArrayList;

public class Program_17 {
	public static void main(String[] args) {
		ArrayList<Integer> ar2= new ArrayList();
		ar2.add(1);
		ar2.add(3);
		ar2.add(9);
		ar2.add(0);
		System.out.println(ar2);
		ar2.add(2, 100);
		System.out.println(ar2);
		
	}

}
