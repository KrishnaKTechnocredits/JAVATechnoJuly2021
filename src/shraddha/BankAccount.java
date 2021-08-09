package shraddha;
class BankAccount{
	String username;
	String pwd;
	int bankAccNumber;
	
	public static void main(String[] args){
		BankAccount bAccount = new BankAccount();
		bAccount.setDetails("ANKITA","anKiTA",1223);
		bAccount.updatePassword("ankita1");
		bAccount.displayInfo();
	}
	
	void setDetails(String name, String password, int bankAccountNo){
		username = name;
		pwd = password;
		bankAccNumber = bankAccountNo;
	}
	
	void updatePassword(String updatedPassword){
		pwd = updatedPassword;
	}
	
	void displayInfo(){
		System.out.println("Username is "+username);
		System.out.println("Password is "+pwd);
		System.out.println("Bank Account Number is "+bankAccNumber);
	}
}