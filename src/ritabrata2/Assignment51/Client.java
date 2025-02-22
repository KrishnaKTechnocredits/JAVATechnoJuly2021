package ritabrata2.Assignment51;

import java.util.ArrayList;
import java.util.Collections;



public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("Ritabrata", 987, 50500, 1);
		Builder b2 = new Builder("Bhattacharyya", 654, 12345, 2);
		Builder b3 = new Builder("Krishna", 951, 34567, 3);
		Builder b4 = new Builder("Maulik", 753, 40000, 4);
		Builder b5 = new Builder("Harsh", 852, 74185, 5);
		ArrayList<Builder> list = new ArrayList<Builder>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		Collections.sort(list, new BuilderRevenueComp());
		System.out.println(list);

		Collections.sort(list, new BuilderCompletedProjComp());
		System.out.println(list);


	}

}
