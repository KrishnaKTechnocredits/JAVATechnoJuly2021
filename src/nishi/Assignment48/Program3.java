/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9*/

package nishi.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program3 {
	String getUniqueNo(int[] input)
	{	
		String str="";
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer i:input)
		{
			if(map.containsKey(i))			
				map.put(i,map.get(i)+1);
			else
				map.put(i,1);			
		}
		for(Integer num:map.keySet())
		{
			if(map.get(num)==1)
				str+=num+",";
		}
		return str;
	}
	public static void main(String[] args) {
		int[] input= {1,11,33,22,22,11,1,9,7,7};
		System.out.println("Output :"+new Program3().getUniqueNo(input));
	}
}
