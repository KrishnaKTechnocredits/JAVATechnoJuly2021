/*program 7 : find the freq of each number in given array.*/
package amol_Pawar.assignment_48;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program_7 {

	void getFreqOfEachNum(int input[])
	{
		Map<Integer, Integer> mapList=new LinkedHashMap<Integer, Integer>();
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
	}
	public static void main(String[] args) {
		
		Program_7 program_7=new Program_7();
		int arr[]= {3,3,4,2,4,57,8,9,9,6,6,32,2};
		program_7.getFreqOfEachNum(arr);
	}

}
