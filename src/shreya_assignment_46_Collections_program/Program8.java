
/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList
*/
package shreya_assignment_46_Collections_program;

import java.util.Arrays;
import java.util.LinkedList;

public class Program8 {
	LinkedList<Integer> getNegativeNumber(int[] input){
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		for(int num:input)
			if(!list1.contains(num) && num<0)
				list1.add(num);
		return list1;
	}
	public static void main(String[] args) {
		Program8 program8=new Program8();
		int[] arr= {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println("Input : "+Arrays.toString(arr));
		System.out.println("Output(All negative numbers are) : "+program8.getNegativeNumber(arr));
	}

}
