package arti_G_Assignment48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 7 : find the freq of each number in given array.*/
public class Program7 {

	void printFrequencyOfEachNumber(int[] input) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int number : input) {
			if(map.containsKey(number))
				map.put(number, map.get(number)+1);
			else
				map.put(number, 1);
		}
		for(int key : map.keySet()) {
			System.out.println(key + ":"+map.get(key));
		}
	}
	public static void main(String[] args) {
		Program7 p7 = new Program7();
		int[] input = { 10, 3, 10, 4, 7, 4, 10, 3, 2, 7 };
		p7.printFrequencyOfEachNumber(input);
	}

}
