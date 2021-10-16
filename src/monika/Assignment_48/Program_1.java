/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/
package monika.Assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Program_1 {
	static Map<String, String> map = new HashMap<String, String>();
	String panCard;

	Program_1(String panCard) {
		this.panCard = panCard;

	}

	String generateAadhar() {
		if (!map.containsKey(panCard))
			map.put(panCard, panCard+ " "+ java.time.Clock.systemUTC().instant());
		return map.get(panCard);
	}

	public static void main(String[] args) {
		Program_1 program_1 = new Program_1("MEVY6985J");
		
		System.out.println(program_1.generateAadhar());
	}

}
