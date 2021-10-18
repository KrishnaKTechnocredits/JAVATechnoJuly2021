package arti_G_Assignment48;

import java.util.HashMap;
import java.util.Map;

/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/
public class Program1 {

	private String panNumber;
	private static Map<String, String> map = new HashMap<String, String>();

	public Program1(String string) {
		// TODO Auto-generated constructor stub
	}

	public void AadharGenerator(String panNumber) {
		this.panNumber = panNumber;
	}

	String getAadharNumber() {
		if (!map.containsKey(panNumber))
			map.put(panNumber, panNumber + 1);
		return map.get(panNumber);
	}	
	public static void main(String[] args) {
		Program1 aadharCenter1 = new Program1("FKAPS6730K");
		System.out.println(aadharCenter1.getAadharNumber());
		System.out.println("******************2********************");
	}

}
