/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList
*/
package nishi.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;

public class Program10 {
	ArrayList<Integer> appendZero(Integer[]  arr)
	{	
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		for(int index=0;index<al.size()-1;index++)
		{			
			if(al.get(index+1)==al.get(index)+1 && al.get(index+2)==al.get(index+1)+1)
			{
				al.add(index+3,0);
			}
		}
		return al;
	}
	
	public static void main(String[] args) {
		Integer[] input= {1,2,3,5,4,7,8,9,11,12,13,15};
		System.out.println("output : "+new Program10().appendZero(input));
	}
}
