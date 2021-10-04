/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/

package shraddha.Assignment44;

import java.util.ArrayList;

public class MaxNumberInArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);

		int maxnumber = 0;
		for (int number : al) {
			if (number > maxnumber)
				maxnumber = number;
		}
		System.out.println(al);
		System.out.println("Max number in above input is :- " + maxnumber);
	}
}
