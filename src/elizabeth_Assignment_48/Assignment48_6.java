/*program 6: find the freq of each word in a given statement.
String input = "Hi Hello Hi Techno Credits Credits Hi Credits"*/

package elizabeth_Assignment_48;
import java.util.LinkedHashMap;  
import java.util.Map; 

class Assignment48_6{
	
	void getFrequencyOfWords(String str){
		String[] arr=new String[str.length()];
		arr=str.split(" ");
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		int count=0;
		for(String temp:arr){
			if(map.containsKey(temp)){
				count=map.get(temp);
				map.put(temp,count+1);
			}else{
				map.put(temp,1);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String[] args){
		Assignment48_6 assignment48_6=new Assignment48_6();
		System.out.println("------Program6-------");
		assignment48_6.getFrequencyOfWords("Hi Hello Hi Techno Credits Credits Hi Credits");
	}
}