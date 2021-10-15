/*Assignment 47 : 6th Oct'2021

Program 1: find frequency of each char from string
	i/p : "varsha"
	o/p : v = 1
		  a = 2
		  r = 1
		  s = 1
		  h = 1
*/

package purshottamJoshi;

import java.util.HashMap;
import java.util.Map;

public class Assignment47 {

	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<>();
		String str="purushottam";
		for(int index=0; index < str.length(); index++) {
			char ch=str.charAt(index);
			if(map.containsKey(ch)) {
				int cnt =map.get(ch);
				map.put(ch, ++cnt); 
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
