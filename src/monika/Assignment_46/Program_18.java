/*Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
 */
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_18 {
	void removeElement(ArrayList<Integer> al) {
		System.out.println("Before removing Object From ArrayList: " +al);
		al.remove(new Integer(74));
		System.out.println("After removing at index 3: " + al);
	}
	
	public static void main(String[] args) {
		Program_18 program_18=new Program_18();
		Integer[] number= {65,58,74,2,36,96};
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(number));
		program_18.removeElement(al);
	}
	

}
