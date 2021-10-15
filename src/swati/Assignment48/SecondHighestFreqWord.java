package swati.Assignment48;

import java.util.LinkedHashMap;

/*
 * program 8 : find the word with second highest freq.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : credits -> 2
 */
public class SecondHighestFreqWord {
	
	 void findSecondHighestFreqWord(String input) {
		 String[] arr=input.split(" ");
		 LinkedHashMap<String,Integer> map1=new LinkedHashMap<String,Integer>();
		 for(String temp:arr) {
			 if(map1.containsKey(temp)) {
				 map1.put(temp,map1.get(temp)+1);
			 }
			 else
				 map1.put(temp,1);
		 }
		 int max=0;
		 int secondMax=0;
		 String word="";
		 for(String temp:map1.keySet()) {
			 if(max<map1.get(temp)) {
				 secondMax=max;
				 max=map1.get(temp);
			 }
			 else if(secondMax<map1.get(temp)){
				 secondMax=map1.get(temp); 
				 word=temp;
			 }
		 }
		 System.out.println(word+" : "+secondMax);
	 }
	
	public static void main(String[] a) {
		SecondHighestFreqWord s1=new SecondHighestFreqWord();
		String input= "Hi Hello Hi Techno Credits Credits Hi";
		s1.findSecondHighestFreqWord(input);				
	}

}

