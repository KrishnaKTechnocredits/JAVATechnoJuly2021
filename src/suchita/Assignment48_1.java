package suchita;
// Assignment 48_1

import java.util.HashMap;
import java.util.Map;

class Assignment48_1 {
	
	//Create a system to generate AadharNumber with rules discussed in class.
	 static Map<String, String> map = new HashMap<String, String>();
	 String panCard;

	Assignment48_1(String panCard) {
		this.panCard = panCard;

	}

	 String generateAadhar() {

		if (!map.containsKey(panCard))
			map.put(panCard, panCard +"\t"+ java.time.Clock.systemUTC().instant());

		return map.get(panCard);
	}

	public static void main(String[] args) {
		
		Assignment48_1 assignment1 = new Assignment48_1("AHGFD1098T");
		Assignment48_1 assignment2 = new Assignment48_1("AHGFD1098T");
		Assignment48_1 assignment3 = new Assignment48_1("BCOP31250U");
		System.out.println(assignment1.generateAadhar());
		System.out.println(assignment2.generateAadhar());
		System.out.println(assignment3.generateAadhar());

	}

}