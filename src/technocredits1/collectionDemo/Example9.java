package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example9 {

	public static void main(String[] args) {
		String[] arr = {"Maulik", "Techno"};
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(10.20);
		al.add(20.20);
		al.add(100.23);
		
		System.out.println(al);
		al.set(1, 200.21);
		System.out.println(al);
	}
}
