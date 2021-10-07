package technocredits1.collectionFramework.hashMapClass;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample4 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap();

		// map1.put("bhakti", 1);
		// map1.put("margi", 2);
		// map1.put("chirag", 3);
		// map1.put(null, 2);

		System.out.println(map1);
		System.out.println(map1.replace("harsh", 9));
		System.out.println(map1.replace("chirag", 5, 6));
		System.out.println(map1);

	}

}
