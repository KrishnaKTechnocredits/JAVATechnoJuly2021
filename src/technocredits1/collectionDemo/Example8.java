package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example8 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int x = 2;
		
		al.add(x);
		al.add(23);
		al.add(90);
		al.add(45);
		al.add(2);
		
		int data = al.get(0);//int ->  Integer [unboxing] // autoboxing
		al.remove(data);
		System.out.println(al);
	}
}
