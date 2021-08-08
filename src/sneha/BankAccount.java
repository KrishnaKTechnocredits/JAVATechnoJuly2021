package sneha;

class BankAccount{
	String name;
	String passwd;
	int accountno;
	void setDetails(String username, String password, int accno){
		name = username;
		passwd = password;
		accountno = accno;
	}
	
	void updatePassword(String password){
		passwd = password;
	}
	
	void displayInfo(){
		System.out.println("username is : " + name + "\t Password is : " + passwd + "\t Account no is " + accountno);
	}
	
	public static void main(String[] a){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("sneha","12345",98457);
		bankaccount.displayInfo();
		bankaccount.updatePassword("6789");
		bankaccount.displayInfo();
	}
}