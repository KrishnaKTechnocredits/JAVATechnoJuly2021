package akanksha_K;

class BankAccount{

      String username;
      String password;
      int bankAccountNo;

	
	void setDetails(String user, String pass, int bankAccount){
	     username= user;
         password= pass;
         bankAccountNo= bankAccount;
	}

	void updatePassword(String pass){
	     password= pass;
	}

	void displayInfo(){
	     System.out.println("username - "+username);
	     System.out.println("password - "+password);
	     System.out.println("Bank Account Number is- "+bankAccountNo);
	}

	public static void main(String[] args){
	     BankAccount bankAccount =new BankAccount();
	     bankAccount.setDetails("Akanksha Karnewar","Aabb",77712);
	     bankAccount.displayInfo();
	     System.out.println("Updated password is- ");
	     bankAccount.updatePassword("GoodMorning12");
	     bankAccount.displayInfo();
	}
}