package arti_G_Assignment48;

import java.util.HashMap;
import java.util.Map;

/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/
public class Program1 {

	static HashMap<String,String> panAadharMap=new HashMap<String,String>();
	String panCard="";
	Program1(String panCard){
		this.panCard=panCard;
	}
	String generatePancard() {

		if(!panAadharMap.containsKey(panCard)) 
			panAadharMap.put(panCard, panCard+1);
		return panAadharMap.get(panCard);

	}
	public static void main(String[] args) {
		Program1 aadharCenter1 = new Program1("BPABJP7351K");
		System.out.println(aadharCenter1.generatePancard());
	}	
}
