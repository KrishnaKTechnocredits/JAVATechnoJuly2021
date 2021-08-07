//Display Account details

package sourabh;

class AccountInfo{
	String userName;
	String password;
	int accNo;
	
	void acDetails(String uName, String pwd, int acN){
		userName = uName;
		password = pwd;
		accNo = acN;
		System.out.println("User Nmae = " + userName);
		System.out.println("Password = " + password);
		System.out.println("Account No. = " + accNo);
		System.out.println("*************************************");
	}
	
	void updatePassword(String upwd){
		password = upwd;
		System.out.println("Your New Password = " + password);
		System.out.println("*************************************");
	}
	
	void displayInfo(){
		System.out.println("User Nmae = " + userName);
		System.out.println("Password = " + password);
		System.out.println("Account No. = " + accNo);
	}
	
	public static void main(String[] args){
		AccountInfo accinfo = new AccountInfo();
		accinfo.acDetails("Sourabh", "Sour123", 11223344);
		accinfo.updatePassword("sour#123");
		accinfo.displayInfo();
	}
}