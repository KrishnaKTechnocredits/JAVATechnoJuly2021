package technocredits1.code_Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionEx1 {
	
	void testYourKnowledge(int[] input) {
		HashMap<Integer,Integer> numberMap = new HashMap<Integer,Integer>();
		for(int number : input) {
			if(numberMap.containsKey(number)) {
				numberMap.put(number, numberMap.get(number)+1);
			}
			else
				numberMap.put(number, 1);
		}
		
		System.out.println(numberMap.keySet());
		System.out.println(numberMap.values());
		
		for(Map.Entry<Integer, Integer> temp : numberMap.entrySet()) {
			 System.out.println(temp.getKey() + " : " + temp.getValue());
		}
		
		/*int temp1=0, temp2=0;
		Set<Integer> keys= numberMap.keySet();
		
		for(int key : keys) {
			if(numberMap.get(key) > temp2) {
				temp1 = key;
				temp2 = numberMap.get(key);
			}
		}
		System.out.println(temp1 + ":" + temp2);
		System.out.println(numberMap);*/
	}
	
	public static void main(String[] args) {
		int[] num  = {10,33,33,33,33,2,2,2,2,56,49,33,10};
		new CollectionEx1().testYourKnowledge(num);
	}
}
