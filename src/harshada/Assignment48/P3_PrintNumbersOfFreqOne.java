/* program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map */

package harshada.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class P3_PrintNumbersOfFreqOne {
	
	
	void getFrequency1Number(int input[]) {
		
	Map <Integer, Integer> map=new HashMap<Integer, Integer>();
	int count=0;
	for(int num : input) {
		if(map.containsKey(num)) {
			map.put(num, map.get(num)+1);
		}else
			map.put(num, 1);		
	}
	System.out.println("Map contents : " +map);
	System.out.println("Numbers with frequency 1 are :");
	for(int num : map.keySet()) {
		
		if(map.get(num)==1) {
			System.out.println(num);
		}
	}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input []= {1,11,33,22,22,11,1,9,7,7};
		P3_PrintNumbersOfFreqOne obj=new P3_PrintNumbersOfFreqOne();
		obj.getFrequency1Number(input);
	}

}
