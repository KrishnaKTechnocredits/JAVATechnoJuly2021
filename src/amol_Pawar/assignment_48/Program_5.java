/*program 5: find the freq of each character in given word.
String input = "technocredits";*/


package amol_Pawar.assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_5 {

	void getGetFreqOfEachChar(String input)
	{
		Map<Character ,Integer> mapList=new HashMap();
		for(int index=0;index<input.length();index++)
		{
			char ch=input.charAt(index);
			if(mapList.containsKey(ch))
			{
				mapList.put(ch, mapList.get(ch)+1);
			}
			else
			{
				mapList.put(ch, 1);
			}
		}
		System.out.println(mapList);
	}
	public static void main(String[] args) {
		Program_5 program5=new Program_5();
		String input = "technocredits";
		program5.getGetFreqOfEachChar(input);
		
	}

}
