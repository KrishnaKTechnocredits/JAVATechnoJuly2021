//Program 1: Create a system to generate AadharNumber with rules discussed in class.

package sayli_Vyavhare.Assignment_48;

import java.util.HashMap;

public class Program_1 {
	static HashMap<String, String> panAadharMap = new HashMap<String, String>();
	String panCard = "";

	Program_1(String panCard) {
		this.panCard = panCard;
	}

	String generatePancard() {

		if (!panAadharMap.containsKey(panCard))
			panAadharMap.put(panCard, panCard + 1);
		return panAadharMap.get(panCard);

	}

	public static void main(String[] args) {
		Program_1 user1 = new Program_1("BpoPAhdg14");
		Program_1 user2 = new Program_1("jpolshhf48");
		Program_1 user3 = new Program_1("PKHGIAJ145");

		System.out.println(user1.generatePancard());
		System.out.println(user2.generatePancard());
		System.out.println(user3.generatePancard());

		user3 = new Program_1("PKHGIAJ145");
		System.out.println(user3.generatePancard());

	}

}
