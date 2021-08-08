package shreya;

class BankAccount{
	String username="Shreya";
	String password="S8111G";
	int bankAccountNumber=356923;
	
	void setDetails(){
		System.out.println("-----Details-----");
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
		System.out.println("Account Number: "+bankAccountNumber);
	}
	
	void updatePassword(String password1){
		password=password1;
	}
	
	void displayInfo(){
		System.out.println("-----Updated Details-----");
		System.out.println("Username: "+username);
		System.out.println("Updated password: "+password);
		System.out.println("Account Number: "+bankAccountNumber);
	}
	
	public static void main(String[] args){
		BankAccount bankaccount=new BankAccount();
		bankaccount.setDetails();
		bankaccount.updatePassword("Sg8111");
		bankaccount.displayInfo();
	}	
}