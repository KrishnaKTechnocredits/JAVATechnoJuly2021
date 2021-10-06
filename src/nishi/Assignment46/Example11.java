/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example11 {
	public static void main(String[] args) {
		Integer[] arr= {1,6,2,5,7,6,3,10};
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> al1=new Example11().findMissingNumber(al);
		System.out.println("output :"+al1);
	}
	
	private ArrayList<Integer> findMissingNumber(ArrayList<Integer> al2) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for(int index=1;index<=10;index++)
		{
			al1.add(index);
		}
		al1.removeAll(al2);
		return al1;
	}
}
