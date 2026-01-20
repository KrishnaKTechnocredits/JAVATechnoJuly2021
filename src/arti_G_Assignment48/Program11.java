package arti_G_Assignment48;

import java.util.HashMap;
import java.util.Map;

/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/
public class Program11 {

	void printDublicateNumber(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int number : input) {
			if (map.containsKey(number))
				map.put(number, map.get(number) + 1);
			else
				map.put(number, 1);
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.println(key + " :" + map.get(key));
		}
	}
	public static void main(String[] args) {
		Program11 p11 = new Program11();
		int[] input = { 1, 8, 33, 22, 22, 11, 1, 9, 77, 77 };
		p11.printDublicateNumber(input);
	}

}
