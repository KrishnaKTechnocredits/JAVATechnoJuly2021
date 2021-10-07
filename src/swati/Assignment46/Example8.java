package swati.Assignment46;

/*
 * Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList
 */
import java.util.*;

public class Example8 {
	
	void returnAllNegativeNo(Integer[] input) {
		List<Integer> output=new LinkedList<Integer>();
		for(int num:input) {
			if(num<0 && !output.contains(num)) {
				output.add(num);
			}
		}
		
		System.out.println(output);
	}

	public static void main(String[] a) {
		Example8 e1=new Example8();
		Integer[] input= {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		e1.returnAllNegativeNo(input);
		
	}
}
