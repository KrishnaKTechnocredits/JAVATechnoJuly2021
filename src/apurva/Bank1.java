package apurva;
class Bank1{
	
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(String name, String pwd, int accno){
		username = name;
		password = pwd;
		bankAccountNumber = accno;
		System.out.println("UserName is: " +username);
		System.out.println("Password is: " +password);
		System.out.println("Accountno is: "+bankAccountNumber);
	}
		
	void updatePassword(String updatedPassword){
		password = updatedPassword;	
		System.out.println("After updation of Password");
	}
		
	void displayInfo(){
		System.out.println("UserName is: "+username);	
		System.out.println("Password is: "+password);
		System.out.println("Accountno is: "+bankAccountNumber);
			
	}
	
	public static void main (String[] args){
		Bank1 bank1 = new Bank1();
		bank1.setDetails("Apu","AD123",1234);
		bank1.updatePassword("DA123");
		bank1.displayInfo();
	}
}