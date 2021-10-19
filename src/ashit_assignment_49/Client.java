package ashit_assignment_49;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("Harshada", "1234a", 1527, 75000);
		Builder b2 = new Builder("harshada", "1234a", 1527, 100000);
		Builder b3 = new Builder("Jigisha", "4321b", 100, 90000);
		Builder b4 = new Builder("sharma", "5678c", 101, 80000);
		Builder b5 = new Builder("charlie", "8765d", 102, 85000);

		HashSet<Builder> setOfBuilders = new HashSet<Builder>();
		setOfBuilders.add(b1);
		setOfBuilders.add(b2);
		setOfBuilders.add(b3);
		setOfBuilders.add(b4);
		setOfBuilders.add(b5);
		System.out.println(setOfBuilders.size());
	}
}