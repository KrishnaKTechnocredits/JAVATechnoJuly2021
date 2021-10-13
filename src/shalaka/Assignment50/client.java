package shalaka.Assignment50;

import java.util.ArrayList;
import java.util.Collections;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Builder> list = new ArrayList<Builder>();
		Builder b1 = new Builder("shalaka", 123, 50000, 1);
		Builder b2 = new Builder("shashank", 456, 20000, 2);
		Builder b3 = new Builder("Anita", 789, 30000, 5);
		Builder b4 = new Builder("sayli", 222, 40000, 7);
		Builder b5 = new Builder("mayur", 111, 70000, 6);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		// System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
