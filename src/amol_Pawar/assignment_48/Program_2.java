/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/


package amol_Pawar.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program_2 {

	
	void checkPairOfSocks(int input[])
	{
		Map<Integer, Integer> mapList=new HashMap();
		for(int index=0;index<input.length;index++)
		{
			int num=input[index];
			if(mapList.containsKey(num))
			{
				mapList.put(num, mapList.get(num)+1);
			}
			else
			{
				mapList.put(num, 1);
			}
		}
		System.out.println(mapList);
		Set<Integer> set=mapList.keySet();
		int output=0;
		for(int inputNum:set)
		{
			output+=mapList.get(inputNum)/2;
		}
		System.out.println("Total pair of Socks in given List"+mapList+" is : "+output);
		
	}
	public static void main(String[] args) {
		
		Program_2 program_2=new Program_2();
		int arr[]= {10,3,10,4,7,4,10,3,2,7};
		program_2.checkPairOfSocks(arr);
	}

}
