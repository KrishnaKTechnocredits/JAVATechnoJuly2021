package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example16 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(); 
		list1.add(12);
		list1.add(23);
		list1.add(44);
		
		ArrayList<Integer> list2 = new ArrayList<>(); 
		list2.add(22);
		list2.add(23);
		
		list2.addAll(list1);
		System.out.println(list2); // 
	}
}
