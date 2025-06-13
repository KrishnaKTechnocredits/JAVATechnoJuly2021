/* program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits" */


package harshada.Assignment48;

import java.util.HashMap;

public class P6_FindFreqOfWord {
	
	static {
		
		System.out.println("Frequency of Word Using Map :");
	}
	
	void findFreqOfWord(String input) {
		
		String inputArr[]=input.split(" ");
		HashMap <String, Integer> map=new HashMap();
		
		for(int i=0; i< inputArr.length; i++ ) {
			
			String temp= inputArr[i];
			
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}else {
				map.put(temp, 1);
			}
		}
		
	System.out.println(map);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P6_FindFreqOfWord obj=new P6_FindFreqOfWord();
		String input = "Hi Hello Hi Techno Credits Credits Hi Credits";
		obj.findFreqOfWord(input);
		
	}

}
