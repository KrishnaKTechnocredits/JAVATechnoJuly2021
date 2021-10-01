/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/

package ritabrata2;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment44 {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(new Integer("10"));
		al.add(new Integer("7"));
		al.add(new Integer("99"));
		al.add(new Integer("53"));
		al.add(new Integer("74"));	
		Object obj= Collections.max(al);
		System.out.println("The max number is: "+obj);
	}

}

