package shraddha.Assignment49;

import java.util.HashSet;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
		CallBuilder obj1 = new CallBuilder("Shraddha", "WJT1986211OCT", 4, 10000);
		CallBuilder obj2 = new CallBuilder("Techno", " CJI90224355AUG", 1, 12000);
		CallBuilder obj3 = new CallBuilder("Credits", " MJH9278583GN", 3, 250000);
		CallBuilder obj4 = new CallBuilder("Shraddha", "WJT1986211OCT", 4, 10000);
		CallBuilder obj5 = new CallBuilder("Hello", " RJI55332211QB", 6, 500000);

		Set<CallBuilder> set = new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		set.add(obj5);

		System.out.println(set.size());
	}
}
