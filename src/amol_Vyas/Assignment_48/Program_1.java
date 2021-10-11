/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/

package amol_Vyas.Assignment_48;

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
			map.put(panCard, panCard + java.time.Clock.systemUTC().instant());
		return map.get(panCard);
	}

	public static void main(String[] args) {
		Program_1 program_1_1 = new Program_1("ALPV0063R");
		Program_1 program_1_2 = new Program_1("ALPV0063R");
		Program_1 program_1_3 = new Program_1("BPPV0062R");
		System.out.println(program_1_1.generateAadhar());
		System.out.println(program_1_2.generateAadhar());
		System.out.println(program_1_3.generateAadhar());

	}

}
