package neha.assignment_48;

/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/
public class User {
	public static void main(String[] args) {
		AadharCenter user1 = new AadharCenter();
		String aadharCardInfo = user1.getAadharNumber("AJFPT4723N");
		System.out.println(aadharCardInfo);
		user1 = new AadharCenter(); //try to generate aadhar number for same user again
		aadharCardInfo = user1.getAadharNumber("AJFPT4723N");
		System.out.println(aadharCardInfo); //aadhar number should be unchanged

	}
}
