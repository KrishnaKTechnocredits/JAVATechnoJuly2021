/* Assignment - 48 : 9th Oct'2021
Program 1: Create a system to generate AadharNumber with rules discussed in class. */

package akanksha_Jain.Assignment_48;

public class Program_1 {

	public static void main(String[] args) {
		AadharCenter aadharcenter1 = new AadharCenter("BJBPK76711N");
		String aadharCardInfo = aadharcenter1.getAadharNumber();
		System.out.println("The unique ID for user1 is " + aadharCardInfo); 
		
		AadharCenter aadharcenter2 = new AadharCenter("MPTPK74517S");
		aadharCardInfo = aadharcenter2.getAadharNumber();
		System.out.println("The unique ID for user2 is " + aadharCardInfo); 
	}
}