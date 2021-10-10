package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Techno");
		al1.add("Chandni");
		al1.add("Indu");
		al1.add("Chandni");
		
		al1.trimToSize();
		System.out.println(al1);
		
		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("Techno");
		al2.add("Chandni");
		al2.add("Indu");
		al2.add("Chandni");
		al2.contains("Indu");
		System.out.println(al2);
	}
}
