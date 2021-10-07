package technocredits1.collectionFramework.hashMapClass;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapExample5 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> table = new Hashtable<>();
		map.put("b", 1);
		map.put("m", 2);
		// map.put("c", 4);
		// map.put(null, 2);
		// map.put("n", 9);
		// map.put("s", null);

		Map<String, Integer> map1 = new HashMap();
		map1.put("c", 3);
		map1.put("m", 7);
		map1.put("b", 1);

		System.out.println(map.equals(map1));

		// map.remove('h');

		// System.out.println(map.remove("harsh"));
		// System.out.println(map.remove("null", 9));
	}

}
