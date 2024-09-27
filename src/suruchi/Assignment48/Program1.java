//Create a system to generate AadharNumber with rules discussed in class.

package suruchi.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program1 {

	private static final Map<String, String> map = new HashMap<String, String>();
	private String panCard;

	Program1(String panCard) {
		this.panCard = panCard;
	}

	String generateAadhar() {
		if (!map.containsKey(panCard))
			map.put(panCard, panCard + 1);
		return map.get(panCard);
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1("BCGPJ0063R");
		Program1 program1_2 = new Program1("BCGPJ0063R");
		Program1 program1_3 = new Program1("BPPVA0062R");
		System.out.println("Aadhar number generated for user1 is: " + program1.generateAadhar());
		System.out.println("Aadhar number generated for user2 is: " + program1_2.generateAadhar());
		System.out.println("Aadhar number generated for user3 is: " + program1_3.generateAadhar());
	}
}