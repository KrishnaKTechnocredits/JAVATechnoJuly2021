/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/
package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Assignment46_11 {

	void removeZeros(Integer[] input,Integer a) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(input));
		
		while(al.contains(a)) {
			al.remove(a);
		}
		
	
		System.out.println(al);
	} 
	public static void main(String[] args) {
		Integer[] input = {10,0,0,1,0,3,0,2,6};
		new Assignment46_11().removeZeros(input,0);
	}
}
