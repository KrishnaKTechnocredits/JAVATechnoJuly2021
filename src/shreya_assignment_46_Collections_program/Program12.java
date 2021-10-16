
/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/
package shreya_assignment_46_Collections_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Program12 {
	void getRemoveZeros(ArrayList<Integer> input) {
		for(int index=0;index<input.size();index++) {
			if(input.get(index)==0) {
				input.remove(input.get(index));
				index--;
			}
		}
		System.out.println("ArrayList after removing all zero's : "+ input);
	}

	public static void main(String[] args) {
		Program12 program12=new Program12();
		Integer[] arr = {10,0,0,1,0,3,0,2,6};
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(arr));
		program12.getRemoveZeros(list1);
	}
}
