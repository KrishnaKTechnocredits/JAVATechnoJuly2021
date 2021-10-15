package vivek.Assignment49;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("vivek", "1234a", 100, 100000);
		Builder b2 = new Builder("vivek", "1234a", 100, 100000);
		Builder b3 = new Builder("patil", "4321b", 101, 90000);
		Builder b4 = new Builder("techno", "5678c", 102, 80000);
		Builder b5 = new Builder("credits", "8765d", 103, 70000);
		
		HashSet<Builder> setOfBuilders = new HashSet<Builder>();
		setOfBuilders.add(b1);
		setOfBuilders.add(b2);
		setOfBuilders.add(b3);
		setOfBuilders.add(b4);
		setOfBuilders.add(b5);
		System.out.println(setOfBuilders.size());
	}
}
