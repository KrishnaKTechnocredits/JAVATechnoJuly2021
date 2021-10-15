
/*Example 11 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/


package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class Program_11_RemoveZero {
	
	static void removeZeroM1(Integer[] num) {
		ArrayList<Integer> input = new ArrayList(Arrays.asList(num));
		for (int i=0; i<input.size(); i++) {
			if (input.get(i)==0) {
				input.remove(i);
				i--;
			}	
		}
		System.out.println(input);
	}
	//m2 
	static void removeZeroM2(Integer[] num) {
		ArrayList<Integer> input = new ArrayList(Arrays.asList(num));
		ArrayList<Integer> n= new ArrayList();
		n.add(0);
		input.removeAll(n);
		System.out.println(input);
	}
	public static void main(String[] args) {
		Integer[] num= {10,0,0,1,0,3,0,2,6};
		removeZeroM1(num);
		removeZeroM2(num);
	}

}