package swati.Assignment48;

/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map
*/
import java.util.*;
public class NumHavingFreq1 {
	
	void findNumWithFreq1(Integer[] input) {
		LinkedHashMap<Integer,Integer> map1=new LinkedHashMap<Integer,Integer>();
		for(int num:input) {
			if(map1.containsKey(num)) {
				map1.put(num,map1.get(num)+1);
			}
			else
				map1.put(num, 1);
		}
		Set<Integer> set1=map1.keySet();
		for(int num:set1) {
			if(map1.get(num)==1) {
				System.out.println(num);
			}
		}
	}	
	
	public static void main(String[] a) {
		NumHavingFreq1 n1=new NumHavingFreq1();
		Integer[] input= {1,11,33,22,22,11,1,9,7,7};
		n1.findNumWithFreq1(input);				
	}
}

