package monika;
class BankAccount{
	String userName="Pooja";
	String password="pass123@";
	int bankAccountNumber=14532;
	 
	 void setDetails(){
		 System.out.println("--------BankAccount Details--------");
		 System.out.println("UserName is="+userName);
		 System.out.println("Password is="+password);
		 System.out.println("Bank AccountNo is="+bankAccountNumber);
	 }
	 
	 void updatePassword(String pass){
		password=pass;
	 }
	 
	 void displayInfo(){
		 System.out.println("--------Updated Password--------");
		 System.out.println("UserName is="+userName);
		 System.out.println("Password is="+password);
		 System.out.println("Bank AccountNo is="+bankAccountNumber);
	 }
	 public static void main(String[] args){
		 BankAccount bankAccount=new BankAccount();
		 bankAccount.setDetails();
		 bankAccount.updatePassword("@#$*&%12");
		 bankAccount.displayInfo();
	 }	 
}