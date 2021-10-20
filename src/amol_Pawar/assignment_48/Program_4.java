/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/

package amol_Pawar.assignment_48;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program_4 {

	void getAllDuplicateWord(String input)
	{
		String arr[]= input.split(" ");
		Map<String,Integer> inputMap=new HashMap();
		for(int index=0;index<arr.length;index++)
		{
			String inputWord= arr[index];
			if(inputMap.containsKey(inputWord))
			{
				inputMap.put(inputWord, inputMap.get(inputWord)+1);
			}
			else
			{
				inputMap.put(inputWord, 1);
			}
		}
		//System.out.println(inputMap);
	Set<String> setKey=	inputMap.keySet();
	for(String key:setKey)
	{
		if(inputMap.get(key)>1)
		{
			System.out.println(key+" : "+inputMap.get(key));
		}
	}
		
	}
	public static void main(String[] args) {
		
		Program_4 program_4=new Program_4();
		String str="Hi Hello Hi Techno Credits Credits Hi Credits";
		program_4.getAllDuplicateWord(str);
	}

}
