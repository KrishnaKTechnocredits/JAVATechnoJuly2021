/*Programming Questions - Collections : 4th Oct'2021
Example 2 :
Write a program to find given number is duplicate in arrayList.*/

package shraddha.Assignment46;

import java.util.ArrayList;

public class CheckForDuplicateNumberArrayList {
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
			if (!outputList.contains(number) && al.indexOf(number) != al.lastIndexOf(number)) {
				outputList.add(number);
				System.out.println(number + " is duplicate number in the list");
			}
		}
	}
}
