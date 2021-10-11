package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList();
		list.add("Amruta");
		list.add("e");
		list.add("Amruta");
		while (list.contains("Amruta")){
			list.remove("Amruta");
		}

		System.out.println(list);
		
		
	}
}
