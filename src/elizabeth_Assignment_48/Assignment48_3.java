/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/

package elizabeth_Assignment_48;
import java.util.HashMap;  
import java.util.Map; 

class Assignment48_3{
	
	void getNumbersWithFrequencyOne(int[] arr){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count=0;
		for(Integer key:arr){
			if(map.containsKey(key)){
				count=map.get(key);
				map.put(key,count+1);
			}else{
				map.put(key,1);
			}
		}
		for(Integer num:map.keySet()){
			if(map.get(num)==1){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment48_3 assignment48_3=new Assignment48_3();
		int[] input={1,11,33,22,22,11,1,9,7,7};
		System.out.println("------Program3-------");
		assignment48_3.getNumbersWithFrequencyOne(input);
	}
}

