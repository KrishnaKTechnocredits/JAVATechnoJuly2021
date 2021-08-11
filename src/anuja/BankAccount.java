package anuja;

class BankAccount{
	
	String username;
	String pwd;
	int bankAccountNumber;

void setDetails(){
	 username="Techno";
	 pwd="XYZ123";
	 bankAccountNumber=13164;
	
}
void updatePassword(String password){
	pwd=password;
	
}
void displayInfo(){
	System.out.println(username);
	System.out.println("Updated password is "+pwd);
	System.out.println(bankAccountNumber);
}

 
public static void main(String args[]){
	BankAccount bankaccount=new BankAccount();
	bankaccount.setDetails();
	bankaccount.updatePassword("ABC678");
	bankaccount.displayInfo();
}
}