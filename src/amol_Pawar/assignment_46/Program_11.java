/*Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program_11 {

	public static void main(String[] args) {
		Integer arr[] = { 10, 0, 0, 1, 0, 3, 0, 2, 6 };
		List<Integer> inputList = new ArrayList(Arrays.asList(arr));
		
	
		ArrayList<Integer> outputList = new ArrayList();
		Iterator<Integer> itr = inputList.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			if (num != 0) {
				outputList.add(num);
			}
		}
		System.out.println("Given ArrayList is "+inputList+" and ArrayList After removing zeros is "+outputList);
	}

}
