package precilla.assignment47;

import java.util.LinkedHashMap;
import java.util.Map;

/*Program 2: find frequency of each word from line
i/p : "hi good morning hello good morning"
o/p : hi = 1
	  good = 2
	  morning = 2
	  hello = 1*/
public class Program2 {
	public static void main(String[] args) {
		String str="hi good morning hello good morning";
		String[] arr=str.split(" ");
		System.out.println("Input : "+str);
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(int index=0;index<arr.length;index++) {
			if(map.containsKey(arr[index])) {
				int count=map.get(arr[index]);
				map.put(arr[index], count+1);
			}else
				map.put(arr[index], 1);
				
		}
		System.out.println("Output : "+map);
	}
}
