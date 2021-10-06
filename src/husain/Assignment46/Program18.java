/*
 * Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
 */
package husain.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 21, 9, 43, 35, 12, 99, 53));
		System.out.println("Input list before removal " + list);
		list.remove((Integer) 43);
		list.remove(new Integer(99));
		System.out.println("Output list after removal " + list);

	}

}
