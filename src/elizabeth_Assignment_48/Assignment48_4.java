/*program 4: print all duplicate words with their freq.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"
output : Hi -> 3
         Credits -> 3*/
		 
package elizabeth_Assignment_48;
import java.util.HashMap;  
import java.util.Map; 

class Assignment48_4{
	
	void printDuplicateWordsWithFreq(String str){
		String[] arr=new String[str.length()];
		arr=str.split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		int count=0;
		for(String temp:arr){
			if(map.containsKey(temp)){
				count=map.get(temp);
				map.put(temp,count+1);
			}else{
				map.put(temp,1);
			}
		}
		for(String word:map.keySet()){
			if(map.get(word)>1){
				System.out.println(word + "->" +map.get(word));
			}
		}
		
	}
	
	public static void main(String[] args){
		Assignment48_4 assignment48_4=new Assignment48_4();
		System.out.println("------Program4-------");
		assignment48_4.printDuplicateWordsWithFreq("Hi Hello Hi Techno Credits Credits Hi Credits");
	}
}