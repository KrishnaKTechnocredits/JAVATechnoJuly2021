/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/

package elizabeth_Assignment_48;
import java.util.LinkedHashMap;  
import java.util.Map; 

class Assignment48_11{
	
	void printDuplicateFromArray(String[] arr){
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
		for(String word:map.keySet()){
			if(map.get(word)>1){
				System.out.println(word);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment48_11 assignment48_11=new Assignment48_11();
		String[] arr={"Techno","Eliza","Mary","Eliza","Credits","Credits","Bengaluru","Chennai","Pune"};
		System.out.println("------Program11-------");
		assignment48_11.printDuplicateFromArray(arr);
	}
}