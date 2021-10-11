/*Create a system to generate AadharNumber and number should be unique */
package indu.Assignment_48;

import java.util.HashMap;

public class GenerateAadharCard {

	private String panNumber;
	private final static HashMap<String, String> map = new HashMap<>();
	
	GenerateAadharCard(String panNumber)
	{
		 this.panNumber = panNumber;
	}
	
	 String getAadharNumber() {
		if (!map.containsKey(panNumber)) {
			map.put(panNumber, panNumber + 1);
		
		}
		return map.get(panNumber);
		//else 
		//	return "Aadhar number "+panNumber+" is not unique generate new Number.";
	}
	
}
