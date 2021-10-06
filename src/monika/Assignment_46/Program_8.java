/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Output : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList
 */
package monika.Assignment_46;

import java.util.Arrays;
import java.util.LinkedList;

public class Program_8 {

	LinkedList<Integer> findNegativeNumbers(int num[]){
	LinkedList<Integer> number=new LinkedList<Integer>();
	for(int index : num)
		if(index<0 && !number.contains(index))
			number.add(index);
	return number;
	}
	public static void main(String[] args) {
		Program_8 program_8=new Program_8();
		int input[]= {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println("Input Array is:"+Arrays.toString(input));
		System.out.println("Non-Duplicate Negative Numbers: "+program_8.findNegativeNumbers(input));
	}
}
