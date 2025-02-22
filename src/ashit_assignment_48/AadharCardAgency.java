/*
 * Assignment - 48 : 9th Oct'2021
Program 1: Create a system to generate AadharNumber with rules discussed in class.
one person trying to request aadhar card multiple times using same pancard. Output will not change. 
---------------------
 */
package ashit_assignment_48;
public class AadharCardAgency {

	public static void main(String[] args) {
		AadharCardGenerator user1 = new AadharCardGenerator("KOTH99857GAUK");
		AadharCardGenerator user2 = new AadharCardGenerator("DIM758096KOTH");
		AadharCardGenerator user3 = new AadharCardGenerator("KOTH99857GAUK");
		AadharCardGenerator user4 = new AadharCardGenerator("KOTH99857GAUK");
		System.out.println("user1 aadhar card number is : "+user1.getAadharCardNumber());
		System.out.println("user2 aadhar card number is : "+user2.getAadharCardNumber());
		System.out.println("user3 aadhar card number is : "+user3.getAadharCardNumber());
		System.out.println("user4 aadhar card number is : "+user4.getAadharCardNumber());
	}

}
