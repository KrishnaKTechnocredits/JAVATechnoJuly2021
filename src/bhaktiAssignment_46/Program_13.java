/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]*/

package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_13 {
	
	static void missingnumberInRange(ArrayList input, int start, int end) {
		ArrayList output= new ArrayList();
		for (int i=start; i<= end; i++) {
			if (!input.contains(i))
				output.add(i);
		}
		System.out.println(output);
		
	}
	public static void main(String[] args) {
		Integer[] num= {1,6,2,5,7,6,3,10};
		ArrayList<Integer> input= new ArrayList(Arrays.asList(num));
		missingnumberInRange(input,1,10);
	}

}
