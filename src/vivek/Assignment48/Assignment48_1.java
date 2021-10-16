/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/

package vivek.Assignment48;

import java.util.HashMap;

public class Assignment48_1 {

	String pancard;
	static HashMap<String, String> map = new HashMap<String, String>();

	String getAadharNumber() {
		if (!map.containsKey(pancard))
			map.put(pancard, pancard + 1);
		return map.get(pancard);
	}

	Assignment48_1(String pancard) {
		this.pancard = pancard;
	}

	public static void main(String[] args) {
		Assignment48_1 user1 = new Assignment48_1("ABCDE12345");
		Assignment48_1 user2 = new Assignment48_1("ABCDE12345");
		Assignment48_1 user3 = new Assignment48_1("PQRST54321");
		Assignment48_1 user4 = new Assignment48_1("AJSSH12763");
		System.out.println(user1.getAadharNumber());
		System.out.println(user2.getAadharNumber());
		System.out.println(user3.getAadharNumber());
		System.out.println(user4.getAadharNumber());
	}
}
