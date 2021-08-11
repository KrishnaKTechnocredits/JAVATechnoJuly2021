package swati;
class BankAccount{
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String uName,String passwd,int accountNo){
		username=uName;
		password=passwd;
		bankAccountNumber=accountNo;
	}
	
	void updatePassword(String newpassword){
		password=newpassword;
	}
	
	void displayInfo(){
		System.out.println("User Name:"+ username);
		System.out.println("Password:" + password);
		System.out.println("Bank Account Number:" + bankAccountNumber);
	}
		
	public static void main (String[] a){
		BankAccount bankaccount=new BankAccount();
		bankaccount.setDetails("SwatiS","sbi@321",876543211);
		bankaccount.updatePassword("sbi#123");
		bankaccount.displayInfo();
	}
}