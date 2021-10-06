/*Example 17:
Write a program to add element at particular index of ArrayList?
 */
package monika.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_17 {
	void getAddedElement(ArrayList<Integer> al) {
		System.out.println("Before Adding an Element: "+al);
		al.add(4,250);
		System.out.println("After Adding an Element: "+al);
	}
	public static void main(String[] args) {
		Program_17 program_17=new Program_17();
		Integer[] number= {65,58,74,2,36,96};
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(number));
		program_17.getAddedElement(al);
		
	}

}
