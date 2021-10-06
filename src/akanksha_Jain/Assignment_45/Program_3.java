/* Assignment-45 : 2nd Oct’2021
Program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4 */

package akanksha_Jain.Assignment_45;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_3 {
	
	void getIndexOfAllOccurences(ArrayList<String> list, String str) {
		System.out.println("Index of all occurances of Akanksha from input- ");
		System.out.println(list);
		System.out.println("Output: ");
		for(int index=0; index<list.size(); index++) {
			if(list.get(index)==str) {
				System.out.println("Index: " + index + " Value: " + list.get(index));
			}
		}
	}

	public static void main(String[] args) {
		String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		String str = "Akanksha";
		Program_3 p3 = new Program_3();
		p3.getIndexOfAllOccurences(list, str);
	}
}