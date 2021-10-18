package shraddha.Assignment50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		CallBuilder obj1 = new CallBuilder("Shraddha", "HAST35098126", 5, 100000);
		CallBuilder obj2 = new CallBuilder("Meghna", "HUGE634578465", 6, 300000);
		CallBuilder obj3 = new CallBuilder("Geeta", "LIWA46725604", 2, 250000);
		CallBuilder obj4 = new CallBuilder("Sita", "ZUMB543127461", 8, 480000);
		CallBuilder obj5 = new CallBuilder("Rita", "CWGA56793211", 5, 500000);

		ArrayList<CallBuilder> al = new ArrayList<>();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);

		Collections.sort(al);
		System.out.println(al);
	}
}
