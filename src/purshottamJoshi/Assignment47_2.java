/*Program 2: find frequency of each word from line
	i/p : "hi good morning hello good morning"
	o/p : hi = 1
		  good = 2
		  morning = 2
		  hello = 1*/
package purshottamJoshi;

import java.util.HashMap;
import java.util.Map;

public class Assignment47_2 {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		String str="hi good morning hello good morning";
		String[] output=str.split(" ");
		for(int index=0; index < output.length; index++) {
			if(map.containsKey(output[index])) {
				int cnt =map.get(output[index]);
				map.put(output[index], ++cnt); 
			}else {
				map.put(output[index], 1);
			}
		}
		System.out.println(map);
	}

}
