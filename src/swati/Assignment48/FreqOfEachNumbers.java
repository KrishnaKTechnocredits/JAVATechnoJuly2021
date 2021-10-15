package swati.Assignment48;

/*
 * program 7 : find the freq of each number in given array.
 */

import java.util.*;

public class FreqOfEachNumbers {
	
	void findFreqOfEachNum(Integer[] input) {
		LinkedHashMap<Integer,Integer> map1=new LinkedHashMap<Integer,Integer>();
		for(int num:input) {
			if(map1.containsKey(num)) {
				map1.put(num,map1.get(num)+1);
			}else
				map1.put(num,1);
		}
		
		System.out.println(map1);
	}
	
	public static void main(String[] a) {
		FreqOfEachNumbers f1=new FreqOfEachNumbers();
		Integer[] input= {1,11,33,22,22,11,1,9,7,7};
		f1.findFreqOfEachNum(input);				
	}

}

