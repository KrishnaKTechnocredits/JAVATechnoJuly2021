// Assignment_5 Bank Account details

package himanshu;

class BankAccount{
	String username;
	String password;
	int accountNumber;
	
	void setDetails(String name, String pwd, int accNumber){
		username=name;
		password=pwd;
		accountNumber=accNumber;
	}
    
	void updatePassword(String updatedPassword){
		password=updatedPassword;
	}
	
	void displayInfo(){
		System.out.println("Bank Account Holder Name:" + username);
		System.out.println("Bank Account Holder Password:" + password);
		System.out.println("Holder Account Number:" + accountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankaccount = new BankAccount();
		bankaccount.setDetails("MS DHONI","Dhoni@07",123456789);
		bankaccount.updatePassword("Mahi@23");
		bankaccount.displayInfo();
	}
}