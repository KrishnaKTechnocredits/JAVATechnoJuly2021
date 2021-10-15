/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllZerosFromList_11 {

	static void removeAllZero()
	{
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(10,0,0,1,0,3,0,2,6));
		System.out.println("Input Array with 0 \n"+alist);
		ArrayList<Integer> output = new ArrayList<>();
		for(int num : alist)
		{
			if(num==0)
			{
				output.add(num);
			}
				
		}
		alist.removeAll(output);
		System.out.println("Array after removing all zero :\n"+alist);

	}
	public static void main(String[] args) {
		removeAllZero();
	}
}
