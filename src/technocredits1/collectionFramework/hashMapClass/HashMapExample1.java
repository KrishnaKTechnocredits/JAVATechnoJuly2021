package technocredits1.collectionFramework.hashMapClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();

		map.put("bhakti", 1);
		map.put("margi", 2);
		map.put("chirag", 3);
		map.put("chandni", 4);
//		map.put(null, 2);
		map.put("null", 9);
		map.put("shardha", null);
		System.out.println(map);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		Iterator<Entry<String, Integer>> itrSet = entrySet.iterator();
		while (itrSet.hasNext()) {
			Entry<String, Integer> entry = itrSet.next();
			String key = entry.getKey();
			System.out.println("Key Length : " + key.length());
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

}
