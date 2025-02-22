package ashit_assignment_50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		ArrayList<Builder> list = new ArrayList<Builder>();
		Builder b1 = new Builder("Ritabrata", 444, 50000, 1);
		Builder b2 = new Builder("Technocredits", 555, 20000, 2);
		Builder b3 = new Builder("Krishna", 666, 30000, 3);
		Builder b4 = new Builder("Maulik", 777, 40000, 4);
		Builder b5 = new Builder("Harsh", 888, 70000, 5);
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
