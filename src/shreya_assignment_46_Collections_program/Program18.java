
/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program18 {
	void removeobject() {
		Integer[] arr= {4,8,1,2,5,65};
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(arr));
			System.out.println("Input : "+list1);
			list1.remove(new Integer(2));
			System.out.println("ArrayList after removing object : "+list1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program18 program18 = new Program18();
		program18.removeobject();
	}

}
