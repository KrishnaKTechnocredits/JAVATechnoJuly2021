/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/

package nishi.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program2 {
	int getNoOfPairs(int[] input)
	{
		int pair=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer num:input)
		{
			if(map.containsKey(num))			
				map.put(num, map.get(num)+1);			
			else
				map.put(num, 1);
			
		}
		for(int num1:map.keySet())
		{
			pair+=map.get(num1)/2;		
		}
		return pair;
	}
	
	public static void main(String[] args) {
		int[] input= {10,3,10,4,7,4,10,3,2,7,10,10};
		System.out.println("Output : "+new Program2().getNoOfPairs(input));
	}
}
