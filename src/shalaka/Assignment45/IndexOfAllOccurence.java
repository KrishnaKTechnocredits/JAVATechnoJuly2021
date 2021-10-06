/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/
package shalaka.Assignment45;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfAllOccurence {
	void printIndex(ArrayList<String> list, String str) {
		System.out.println("Input:" + list);
		System.out.println("Index of " + str + " is: ");
		for (int index = 0; index < list.size(); index++) {
			String str1 = list.get(index);
			if (str1 == str) {
				 System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Techno", "Akanksha", "Mayur", "Chandni", "Akanksha", "Amruta", "Chandni", "Parthav","Mayur", "Amruta", "Credits", "Amruta" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		String str = "Akanksha";
		IndexOfAllOccurence indexOfAllOccurence = new IndexOfAllOccurence();
		indexOfAllOccurence.printIndex(list, str);
	}

}
