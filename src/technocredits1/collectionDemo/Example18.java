package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example18 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(); 
		list1.add(12); // D
		list1.add(23); // D
		list1.add(44);
		
		ArrayList<Integer> list2 = new ArrayList<>(); 
		list2.add(22);
		list2.add(23);
		list2.add(12);
		
		ArrayList<Integer> list3 = new ArrayList<>(list1); // // 12 23 44 22
		
		for(int data : list2) {
			if(!list3.contains(data))
				list3.add(data);
		}
		System.out.println(list3);
	}
}
