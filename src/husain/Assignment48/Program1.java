/*
 * Program 1: Create a system to generate AadharNumber with rules discussed in class.
 */
package husain.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program1 {

	private static Map<String, String> map = new HashMap<String, String>();
	private String panCard;

	Program1(String panCard) {
		this.panCard = panCard;

	}

	final String generateAadhar() {

		if (!map.containsKey(panCard))
			map.put(panCard, panCard + java.time.Clock.systemUTC().instant());

		return map.get(panCard);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program1 obj = new Program1("AHGFD1098T");
		Program1 obj1 = new Program1("AHGFD1098T");
		Program1 obj2 = new Program1("BCOP31250U");
		System.out.println(obj.generateAadhar());
		System.out.println(obj1.generateAadhar());
		System.out.println(obj2.generateAadhar());

	}

}
