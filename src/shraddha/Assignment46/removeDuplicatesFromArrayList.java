/*Programming Questions - Collections : 4th Oct'2021
 * Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/

package shraddha.Assignment46;

import java.util.ArrayList;

public class removeDuplicatesFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(25);
		al.add(53);
		al.add(72);
		al.add(10);
		al.add(72);
		System.out.println(al);
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (Integer number : al) {
			if (!outputList.contains(number)) 
				outputList.add(number);
		}
		System.out.println(outputList);
	}
}
