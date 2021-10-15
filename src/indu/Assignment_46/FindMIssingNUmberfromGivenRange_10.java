/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
*/
package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMIssingNUmberfromGivenRange_10 {

	static void getMissingNum(int startIndex ,int endIndex)
	{
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,6,2,5,7,6,3,10));
		System.out.println("Input array is :\n"+input);
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index= startIndex;index<endIndex;index++)
		{
			if(!(input.contains(index)))
			{
				output.add(index);
			}
		}
		System.out.println("Number not present in input array from range "+startIndex +" - "+ endIndex+" is :\n"+output);
	}
	
	public static void main(String[] args) {
		getMissingNum(1,10);
	}
}
