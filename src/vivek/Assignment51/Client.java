package vivek.Assignment51;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("vivek", "1234a", 101, 100000);
		Builder b2 = new Builder("abcd", "1234a", 100, 10000);
		Builder b3 = new Builder("patil", "4321b", 101, 90000);
		Builder b4 = new Builder("techno", "5678c", 102, 80000);
		Builder b5 = new Builder("credits", "8765d", 103, 70000);

		ArrayList<Builder> list = new ArrayList<Builder>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		Collections.sort(list, new revenueComparator());
		System.out.println(list);
		Collections.sort(list, new totalCompletedProjectComparator());
		System.out.println(list);
	}
}
