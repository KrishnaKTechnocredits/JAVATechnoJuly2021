package shalaka.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class AadharNumber {
	String panNumber;

	static Map<String, String> map = new HashMap<String, String>();

	AadharNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	String getAadharNumber() {
		if (!map.containsKey(panNumber)) {
			map.put(panNumber, panNumber + 1);
		}
		return panNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AadharNumber aadharNumber = new AadharNumber("ABCD234F");
		System.out.println(aadharNumber.getAadharNumber());
	}

}
