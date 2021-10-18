package aniket.assignment_48;
/*Create a system to generate AadharNumber and number should be unique */
import java.util.HashMap;

public class GenerateAdharCard {

	private String panNumber;
	private final static HashMap<String, String> map = new HashMap<>();

	GenerateAdharCard(String panNumber) {
		this.panNumber = panNumber;
	}

	String getAadharNumber() {
		if (!map.containsKey(panNumber)) {
			map.put(panNumber, panNumber + 1);

		}
		return map.get(panNumber);
		// else
		// return "Aadhar number "+panNumber+" is not unique generate new Number.";
	}

}