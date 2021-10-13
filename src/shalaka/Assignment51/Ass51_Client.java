package shalaka.Assignment51;

import java.util.ArrayList;
import java.util.Collections;

public class Ass51_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ass51_Builder b1 = new Ass51_Builder("shalaka", 123, 50000, 1);
		Ass51_Builder b2 = new Ass51_Builder("shashank", 456, 20000, 2);
		Ass51_Builder b3 = new Ass51_Builder("Anita", 789, 30000, 5);
		Ass51_Builder b4 = new Ass51_Builder("sayli", 222, 40000, 7);
		Ass51_Builder b5 = new Ass51_Builder("mayur", 111, 70000, 6);
		ArrayList<Ass51_Builder> list = new ArrayList<Ass51_Builder>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		Collections.sort(list, new BuilderRevenueComparator());
		System.out.println(list);

		Collections.sort(list, new BuilderTotalCompletedProjectComparator());
		System.out.println(list);
	}

}
