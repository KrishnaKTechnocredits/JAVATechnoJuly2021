package technocredits1.collectionFramework.hashMapClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample3 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap();

		map1.put("bhakti", 1);
		map1.put("margi", 2);
		map1.put("chirag", 3);
		map1.put(null, 2);

		Map<String, Integer> map2 = new HashMap();
		map2.put("chandni", 4);
		map2.put("null", 9);
		map2.put("shardha", null);
		map2.put("margi", 9);
		
		map1.putAll(map2);
		System.out.println(map1);

	}

}
