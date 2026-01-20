package dattaraj.dattaraj_Assignment_48;

import java.util.HashMap;

public class AadharCenter {
	static HashMap<String,String> panAadharMap = new HashMap<String, String>();
	String panCard;
	static int count = 0;
	
	AadharCenter(String panCard){
		this.panCard = panCard;
	}
	
	String getAadharNumber(){
		if(!panAadharMap.containsKey(panCard))
			panAadharMap.put(panCard, panCard+count++);
		return panAadharMap.get(panCard);
	}
}
