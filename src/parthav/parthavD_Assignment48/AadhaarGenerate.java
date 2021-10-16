package parthav.parthavD_Assignment48;

import java.util.HashMap;
import java.util.Map;

public class AadhaarGenerate {
	
	String panCard;
	static int countOfAadharsGenerated = 0;
	static Map<String, String> map = new HashMap<>();
	
	AadhaarGenerate(String panCard){
		this.panCard = panCard;
	}
	
	
	String generateAadhaar() {
		if (!map.containsKey(panCard)) {
			map.put(panCard, panCard+1);
			countOfAadharsGenerated++;
			return map.get(panCard);
		}
		else
			return map.get(panCard);
		
	}

}
