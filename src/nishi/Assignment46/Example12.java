/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package nishi.Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

public class Example12 {
	public static void main(String[] args) {
		Integer[] arr= {10,0,0,1,0,3,0,2,6};
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer> al1=new Example12().removeZeros(al);
		System.out.println("output :"+al1);
	}
	
	private ArrayList<Integer> removeZeros(ArrayList<Integer> al2) {
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for(int index=0;index<al2.size();index++)
		{
			if(al2.get(index)==0)
			al1.add(al2.get(index));
		}
		al2.removeAll(al1);
		return al2;
	}
}
