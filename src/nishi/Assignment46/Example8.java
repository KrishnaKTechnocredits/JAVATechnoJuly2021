/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
//import java.util.TreeSet;

public class Example8 {
	public static void main(String[] args) {
		Integer[] arr= {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println("input : "+Arrays.toString(arr));
		List<Integer> set=new Example8().getNegativeNos(Arrays.asList(arr));
		System.out.println("Output "+set);
	}

	private ArrayList<Integer> getNegativeNos(List<Integer> al) {
		ArrayList<Integer> a=new ArrayList<Integer>();		
		for(int index=0;index<al.size();index++)
		{
			if(al.get(index)<0)
			{
				if(!a.contains(al.get(index)))
				{
					a.add(al.get(index));
				}
			}
		}		
		return a;
	}
}
