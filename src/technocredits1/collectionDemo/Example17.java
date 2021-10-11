package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example17 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(); 
		list1.add(12); // D
		list1.add(23); // D
		list1.add(44);
		
		ArrayList<Integer> list2 = new ArrayList<>(); 
		list2.add(22);
		list2.add(23);
		list2.add(12);
		
		list1.removeAll(list2);
		list1.addAll(list2);
		System.out.println(list1); // 12 23 44 22 
	}
}
