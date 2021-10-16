/*program 5: find the freq of each character in given word.
String input = "technocredits";*/

package elizabeth_Assignment_48;
import java.util.LinkedHashMap;  
import java.util.Map; 

class Assignment48_5{
	
	void getFrequencyOfCharacters(String str){
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		int count=0;
		char ch=' ';
		for(int index=0;index<str.length();index++){
			ch=str.charAt(index);
			if(map.containsKey(ch)){
				count=map.get(ch);
				map.put(ch,count+1);
			}else{
				map.put(ch,1);
			}
		}
		System.out.println(map);
	}
	
	public static void main(String[] args){
		Assignment48_5 assignment48_5=new Assignment48_5();
		System.out.println("------Program5-------");
		assignment48_5.getFrequencyOfCharacters("technocredits");
	}
}