package technocredits1.collectionFramework.linkedHashMapClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		map.put('f', 5);
		map.put('p', 9);
		map.put('a', 7);
		map.put('m', 1);

		System.out.println(map);
		// Map<Character, Integer> map1 = new LinkedHashMap<>();
		// map1.put('f', 5);
		// map1.put('p', 9);
		// System.out.println(map.equals(map1));
		Set<Character> keys = map.keySet();
		Set<Character> ch = new HashSet<>(keys);
		Set<Character> ch1 = new LinkedHashSet<>(ch);
		Set<Character> ch2 = new TreeSet<>(ch);
		
		Collection<Integer> values = map.values();

		List<Integer> list = new ArrayList<>(values);
		Collections.sort(list);
		new HashSet<>(values);
		new TreeSet(keys);
		new LinkedList<>(values);

		System.out.println(values);

	}
}
