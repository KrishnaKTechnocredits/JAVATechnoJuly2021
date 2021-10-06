/*Find the second largest number from Given Array.
Hint : Convert Array -> TreeSet -> ArrayList*/

package astha.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;


public class Assignment6 {

	void getSecondHighestNum(Integer[] input) {
		TreeSet<Integer> list1 = new TreeSet<Integer>(Arrays.asList(input));
		ArrayList<Integer> list2 = new ArrayList<Integer>(list1);
		System.out.println("The second highest number is " +(list2.get(list2.size()-2)));
	}
	
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		Integer[] inputArr = { 10,20,30,55,66,77,66,20,100,98};
		assignment6.getSecondHighestNum(inputArr);
	}
}
