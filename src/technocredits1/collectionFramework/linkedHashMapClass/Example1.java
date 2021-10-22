package technocredits1.collectionFramework.linkedHashMapClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		System.out.println(map.put('f', 5));
		System.out.println(map.put('f', 9));

		System.out.println(map.remove('f',20));
		// System.out.println(map);

		Set<Character> keys = map.keySet();

		Iterator<Character> itr = keys.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Set<Entry<Character, Integer>> entry = map.entrySet();
		System.out.println(entry);

		Iterator<Entry<Character, Integer>> itr_1 = entry.iterator();

		while (itr_1.hasNext()) {
			Entry<Character, Integer> values = itr_1.next();
			System.out.println("values : " + values);
			System.out.println(values.getKey() + values.getValue());
		}

		Collection<Integer> value = map.values();

		HashSet set = new HashSet<>(value);
		System.out.println(set);

		// Set<Character> set = map.keySet();
		ArrayList lits = new ArrayList<>(map.keySet());

		Collection<Integer> values = map.values();
		// System.out.println(values);

		List<Integer> list = new ArrayList<>(values);
		Collections.sort(list);
		new HashSet<>(values);
		new TreeSet(keys);
		new LinkedList<>(values);

		// System.out.println(values);

	}
}
