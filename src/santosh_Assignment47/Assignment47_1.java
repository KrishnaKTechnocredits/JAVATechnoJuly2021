
/*Assignment 47 : 

Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1
*/
package santosh_Assignment47;
import java.util.LinkedHashMap;
public class Assignment47_1 {

	void findCharFrequency()
	{

		String str = "Varsha";
	    System.out.println("Input string is :"+str +"\nOutput is :"+"\nfrequency of each char from given string is:");
        char ch[] = str.toCharArray();
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
				map.put(c, 1);
		}

		System.out.print(map);
	}

	public static void main(String[] args) {
		Assignment47_1 ass47_1= new Assignment47_1();
		ass47_1.findCharFrequency();
	}
}
 