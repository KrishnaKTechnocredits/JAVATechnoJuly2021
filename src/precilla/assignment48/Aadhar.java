package precilla.assignment48;

import java.util.HashMap;
//Program 1: Create a system to generate AadharNumber with rules discussed in class.
public class Aadhar {
	static HashMap<String,String> panAadharMap=new HashMap<String,String>();
	String panCard="";
	Aadhar(String panCard){
		this.panCard=panCard;
	}
	String generatePancard() {
	
		if(!panAadharMap.containsKey(panCard)) 
			panAadharMap.put(panCard, panCard+1);
		return panAadharMap.get(panCard);

	}
	public static void main(String[] args) {
		Aadhar user1=new Aadhar("BpoPAhdg14");
		Aadhar user2=new Aadhar("jpolshhf48");
		Aadhar user3=new Aadhar("PKHGIAJ145");
		
		System.out.println(user1.generatePancard());
		System.out.println(user2.generatePancard());
		System.out.println(user3.generatePancard());
		
		user3=new Aadhar("PKHGIAJ145");
		System.out.println(user3.generatePancard());
		
		
	}

}
