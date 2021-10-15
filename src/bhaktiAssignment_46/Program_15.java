/*Example 15:
Write a program to convert Array to List.
*/
package bhaktiAssignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_15 {
	public static void main(String[] args) {
		Integer[] num1= {1,2,45,70,23};
		List<Integer> l1 = Arrays.asList(num1);
		//above l1 : read only 
		ArrayList ar1= new ArrayList(l1);
		
	}

}
