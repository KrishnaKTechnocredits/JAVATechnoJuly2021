package technocredits1.collectionFramework.listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(9);
		list.add(0);

		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer num = itr.next();
			System.out.println(num);
		}

		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(4);
		list1.add(89);
		list1.add(12);
		list1.add(0);

		list.retainAll(list1);
		System.out.println(list);
	}
}
