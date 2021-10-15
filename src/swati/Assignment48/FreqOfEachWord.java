package swati.Assignment48;

import java.util.LinkedHashMap;

/*
 * program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
 */
public class FreqOfEachWord {
	
	void findFreqOfEachWord(String input) {
		String[] arr=input.split(" ");
		LinkedHashMap<String,Integer> map1=new LinkedHashMap<String,Integer>();
		for(String str:arr) {
			if(map1.containsKey(str)) {
				map1.put(str,map1.get(str)+1);
			}else
				map1.put(str,1);
		}
		
		System.out.println(map1);
	}

	public static void main(String[] a) {
		FreqOfEachWord s1=new FreqOfEachWord();
		String input= "Hi Hello Hi Techno Credits Credits Hi Credits";
		s1.findFreqOfEachWord(input);				
	}
}

