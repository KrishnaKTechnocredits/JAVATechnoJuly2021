/*program 7 : find the freq of each number in given array.*/
package nishi.Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program7 {
	public static void main(String[] args) {
		int[] input= {10,3,10,4,7,4,10,3,2,7,10,10};
		Map<Integer,Integer> map=new Program7().findFrequencyOfInt(input);
		System.out.println(map);

	}

	Map<Integer,Integer> findFrequencyOfInt(int[] arr)
	{		
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(Integer c:arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		return map;
	}
}
