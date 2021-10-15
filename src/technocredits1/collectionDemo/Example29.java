package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Example29 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rasika");
		al.add("Akanksha");
		al.add("Varun");
		al.add("Vivek");
		al.add("Rasika");
		
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(11);
		al1.add(3);
		
		Collections.sort(al1);
		System.out.println(al1);
	}
}
