package neha.assignment_48;

import java.util.HashMap;

/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/
public class AadharCenter {
	static HashMap<String, String> panAadharMap = new HashMap<String, String>();

	String getAadharNumber(String panCard) {
		if (!panAadharMap.containsKey(panCard))
			panAadharMap.put(panCard, panCard + java.time.LocalDateTime.now());
		return panAadharMap.get(panCard);
	}
}
