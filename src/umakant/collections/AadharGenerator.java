package umakant.collections;


import java.util.HashMap;
import java.util.Map;

public class AadharGenerator {

	private String panNumber;
	private static Map<String, String> map = new HashMap<String, String>();

	public AadharGenerator(String panNumber) {
		this.panNumber = panNumber;
	}

	String getAadharNumber() {
		if (!map.containsKey(panNumber))
			map.put(panNumber, panNumber + 1);
		return map.get(panNumber);
	}

}
