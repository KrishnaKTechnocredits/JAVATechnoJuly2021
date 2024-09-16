package dattaraj.dattaraj_Assignment_48;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AadharCenter aadharcenter1 = new AadharCenter("ADHPW7450Q");
		String aadharCardInfo = aadharcenter1.getAadharNumber();
		System.out.println("The unique ID for user1 is " + aadharCardInfo); 
		
		AadharCenter aadharcenter2 = new AadharCenter("JKIUNSK897");
		aadharCardInfo = aadharcenter2.getAadharNumber();
		System.out.println("The unique ID for user2 is " + aadharCardInfo);
	}

}
