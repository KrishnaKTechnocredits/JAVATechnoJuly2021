package dattaraj;

class BankAccount{
	String userName,userPass;
	int accountNumber;
	void setDetails(String u_name,String u_pass,int acc_no){
		userName=u_name;
		userPass=u_pass;
		accountNumber=acc_no;
    }

    void updatePassword(String pass){
		userPass=pass;
    }
	
	void displayInfo(){
		System.out.println("Account User Name :"+userName);
		System.out.println("Account Password :"+userPass);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("------------------------------------------------");
    }
	
	public static void main(String[] args){
		BankAccount acc = new BankAccount();
	
		acc.setDetails("Datta","1253rvv",5674333);
		acc.displayInfo();
		acc.updatePassword("Pass@123");
		acc.displayInfo();
	}	
}