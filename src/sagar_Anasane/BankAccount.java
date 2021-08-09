package sagar_Anasane;

class BankAccount{
	String userName, password;
	int accNo;
	void setDetails(String name, String pass, int no){
		userName = name;
		password = pass;
		accNo = no;
		System.out.println("User Name = " + name);
		System.out.println("Password = " + pass);
		System.out.println("Account No. = " + no +"\n");
	}
	void updatePassword(String pass){
		password = pass;
	}
	
	void displayInfo(){
		System.out.println("Bank Account Details  " + "\n" + "User Name = " +userName);
		System.out.println("Password =" + password);
		System.out.println("Bank Account No. = " + accNo);
	}
	
	public static void main(String[] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.setDetails("Nikesh Shah" , "Niks@2021" , 12045);
		bankAccount.updatePassword("Shah$1994");
		bankAccount.displayInfo();
	}
}
