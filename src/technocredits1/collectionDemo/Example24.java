package technocredits1.collectionDemo;

import java.util.TreeSet;

public class Example24 {

	public static void main(String[] args) {
		Object obj1 = 1;
		Object obj2 = 123;
		Object obj3 = 12;
		
		TreeSet<Object> ts = new TreeSet();
		ts.add(obj1);
		ts.add(obj2);
		ts.add(obj3);
		
		System.out.println(ts);
		
	}
}
