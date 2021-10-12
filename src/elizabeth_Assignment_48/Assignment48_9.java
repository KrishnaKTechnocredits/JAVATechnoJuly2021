/*program 9 : find the first non repeating word from given string.
String input = "Hi Hello Hi Techno Credits Hi Credits"
output : Hello
Hint : LinkedHashMap*/

package elizabeth_Assignment_48;
import java.util.LinkedHashMap;  
import java.util.Map; 

class Assignment48_9{
	
	void getFirstNonRepeatingWord(String str){
		String[] arr=new String[str.length()];
		arr=str.split(" ");
		int count=0;
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(String temp:arr){
			if(map.containsKey(temp)){
				count=map.get(temp);
				map.put(temp,count+1);
			}else{
				map.put(temp,1);
			}
		}
		for(String word:map.keySet()){
			if(map.get(word)==1){
				System.out.println(word);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Assignment48_9 assignment48_9=new Assignment48_9();
		System.out.println("------Program9-------");
		assignment48_9.getFirstNonRepeatingWord("Hi Hello Hi Techno Credits Hi Credits");
	}
}