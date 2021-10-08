/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
*/
package bhaktiAssignment_46;

import java.util.ArrayList;

public class Program_18 {
	public static void main(String[] args) {
		ArrayList<Integer> ar2= new ArrayList();
		ar2.add(1);
		ar2.add(3);
		ar2.add(9);
		ar2.add(0);
		System.out.println(ar2);
		Integer num= new Integer(3);
		ar2.remove(num);
		System.out.println(ar2);
		

	}

	private static Integer Integer(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
