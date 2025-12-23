/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/

package astha.Assignment48;

import java.util.HashSet;

public class Program11 {

	void findDuplicate(int[] input) {
		HashSet<Integer> inputSet = new HashSet<Integer>();
		for(int index=0; index<input.length;index++) {
			if(!(inputSet.add(input[index])))
				System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args) {
		Program11 program11 = new Program11();
		System.out.println("The duplicate numbers present in the array are");
		int[] input = { 1,2,3,4,5,6,6,8,8,3,1,7};
		program11.findDuplicate(input);
	}
}
