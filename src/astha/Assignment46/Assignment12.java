/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package astha.Assignment46;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment12 {

	ArrayList<Integer> removeZeros(ArrayList<Integer> input){
		Iterator<Integer> itr = input.iterator();
		while(itr.hasNext()) {
				if(itr.next() == 0)
					itr.remove();
		}
		return input;
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(0);
		list.add(2);
		list.add(6);
		System.out.println(list);
		System.out.println(assignment12.removeZeros(list));
	}
}
