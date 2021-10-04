/* Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99 */

package akanksha_Jain;

import java.util.ArrayList;

public class Assignment_44 {
	
	int findMaxNumber(ArrayList<Integer> al) {
		int max = 0;
		for(int index=0; index<al.size(); index++) {
			if(max<al.get(index)) {
				max = al.get(index);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		Assignment_44 assignment_44 = new Assignment_44();
		System.out.println("The maximum number from arraylist " + al + " is " + assignment_44.findMaxNumber(al));
	}
}