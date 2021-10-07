package technocredits1.collectionFramework.hashMapClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();

		map.put("bhakti", 1);
		map.put("margi", 2);
		map.put("chirag", 3);
		map.put("chandni", 4);
		// map.put(null, 2);
		map.put("null", 9);
		map.put("shardha", null);

		Set<String> keySet = map.keySet();
		Iterator<String> itr = keySet.iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " : " + map.get(key));
		}

	}

}
