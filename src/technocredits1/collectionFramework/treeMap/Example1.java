package technocredits1.collectionFramework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Example1 {

	
	public static void main(String[] args) {
		Map<Character, Integer> map = new TreeMap();
		map.put('v', 9);
		map.put('z', 8);
		map.put('e', 2);
		map.put('q', 0);
		map.put('i', 4);
		map.put(null, 6);
		System.out.println(map);
	}
}
