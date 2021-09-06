package mratunjay.Assignment_1_To_5;

class Assignment_5{
	
	String username;
	String password;
	int accountNumber;
	
	void setUserDetails(String user,String password1,int bankNumber){
		username = user;
		password = password1;
		accountNumber = bankNumber;
	}
	
	void updatePassword(String newPassword){
		password = newPassword;
	}
	
	void displayInfo(){
		
		System.out.println("Customer confidential details are: ");
		System.out.println("Username:  "+username);
		System.out.println("Password:  "+password);
		System.out.println("Account Number: "+accountNumber);
	}
	public static void main(String[] args){
		
		Assignment_5 b1 = new Assignment_5();
		
		b1.setUserDetails("Dhaata Sharma","pwd123",123);
		b1.displayInfo();
		b1.updatePassword("123@pwd");
		b1.displayInfo();
				
	}
}