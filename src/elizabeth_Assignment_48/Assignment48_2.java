/*Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map

if(hm.containsKey(key))
	hm.put(key, hm.get(key)+1);
else
	hm.put(key,1);*/

package elizabeth_Assignment_48;
import java.util.HashMap;  

class Assignment48_2{
	
	int getPairCount(int[] arr){
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int count=0;
		for(Integer key:arr){
			if(hm.containsKey(key)){
				hm.put(key,hm.get(key)+1);
			}else{
				hm.put(key,1);
			}
		}
		for(Integer temp:hm.keySet()){
			if(hm.get(temp)>=2){
				count=count+hm.get(temp)/2;
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Assignment48_2 assignment48_2=new Assignment48_2();
		int[] input={10,3,10,4,7,4,10,3,2,7};
		System.out.println("------Program2-------");
		System.out.println(assignment48_2.getPairCount(input));
	}
}