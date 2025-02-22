package shantanu.collectionFramework_assignment48;

import java.util.HashMap;

public class Program1 {
	String pancard;
	static HashMap<String, String> map = new HashMap<String, String>();

	String getAadharNumber() {
		if (!map.containsKey(pancard))
			map.put(pancard, pancard + 1);
		return map.get(pancard);
	}

	Program1(String pancard) {
		this.pancard = pancard;
	}

	public static void main(String[] args) {
		Program1 user1 = new Program1("ABCDE12345");
		Program1 user2 = new Program1("ABCDE12345");
		Program1 user3 = new Program1("PQRST54321");
		Program1 user4 = new Program1("AJSSH12763");
		System.out.println(user1.getAadharNumber());
		System.out.println(user2.getAadharNumber());
		System.out.println(user3.getAadharNumber());
		System.out.println(user4.getAadharNumber());
	}
}
