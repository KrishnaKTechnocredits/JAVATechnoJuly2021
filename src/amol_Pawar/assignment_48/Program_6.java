/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/


package amol_Pawar.assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_6 {

	void getFreqOfEachWord(String input)
	{
		String wordArr[]= input.split(" ");
		Map<String, Integer> mapList=new HashMap();
		for(int index=0;index<wordArr.length;index++)
		{
			String word=wordArr[index];
			if(mapList.containsKey(word)) 
			{
				mapList.put(word, mapList.get(word)+1);
			}
			else 
			{
				mapList.put(word, 1);
			}
		}
		System.out.println(mapList);
		
	}
	public static void main(String[] args) {
		Program_6 program_6=new Program_6();
		String str="Hi Hello Hi Techno Credits Credits Hi Credits";
		program_6.getFreqOfEachWord(str);
		

	}

}
