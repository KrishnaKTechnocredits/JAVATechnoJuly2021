package arti_G_Assignment48;

import java.util.HashMap;
import java.util.Map;

/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/
public class Program3 {

	void printUniqueElements(int[] input) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int number : input) {
		if(map.containsKey(number))
			map.put(number, map.get(number)+1);
		else
			map.put(number, 1);
	}
	for(int key : map.keySet()) {
		if(map.get(key)==1)
			System.out.println(key + " ");
	}
	System.out.println();
	}
	
	public static void main(String[] args) {
		Program3 p3 = new Program3();
		int[] input2 = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		p3.printUniqueElements(input2);
	}

}
