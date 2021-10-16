/*program 7 : find the freq of each number in given array.*/
package elizabeth_Assignment_48;
import java.util.LinkedHashMap;  
import java.util.Map; 

class Assignment48_7{
	
	void getFrequencyOfNumbers(Integer[] arr){
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		int count=0;
		for(Integer temp:arr){
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
		Assignment48_7 assignment48_7=new Assignment48_7();
		Integer[] input={10,20,30,50,60,10,30,20,40};
		System.out.println("------Program7-------");
		assignment48_7.getFrequencyOfNumbers(input);
	}
}