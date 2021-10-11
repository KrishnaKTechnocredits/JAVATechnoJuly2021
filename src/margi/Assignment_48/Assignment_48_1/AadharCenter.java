package margi.Assignment_48.Assignment_48_1;

import java.util.HashMap;

////Create a system to generate AadharNumber with rules discussed in class.
public class AadharCenter {

	static HashMap<String, String> map = new HashMap<>();

	String getAadharNumber(String panCard) {
		if (!map.containsKey(panCard))
			map.put(panCard, panCard + 1);
		return map.get(panCard);
	}
}
