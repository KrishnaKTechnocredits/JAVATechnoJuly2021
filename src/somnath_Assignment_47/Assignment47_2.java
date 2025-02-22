package somnath_Assignment_47;
			
			/* Program 2: find frequency of each word from line
					input : "hi good morning hello good morning"
					output : hi = 1
					good = 2
					morning = 2
					hello = 1
							*/


import java.util.LinkedHashMap;
public class Assignment47_2 {

void findFrequency()
{

	String input = "hi good morning hello good morning";
	System.out.println("Input string is :\n"+input +"\nOutput is :");
	String str[]=input.split(" ");
	LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
	for(String str1 : str)
	{
		if(map.containsKey(str1))
		{
			map.put(str1,map.get(str1)+1);
		}
		else
			map.put(str1, 1);
	}

	System.out.print(map);
}

public static void main(String[] args) {
	Assignment47_2 ass2 = new Assignment47_2();
	ass2.findFrequency();
}
}
